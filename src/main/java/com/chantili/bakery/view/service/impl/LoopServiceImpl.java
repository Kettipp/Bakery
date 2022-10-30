package com.chantili.bakery.view.service.impl;

import com.chantili.bakery.view.exception.ExitException;
import com.chantili.bakery.view.exception.WrongCommandException;
import com.chantili.bakery.view.service.CommandService;
import com.chantili.bakery.view.service.InOutService;
import com.chantili.bakery.view.service.LoopService;
import com.chantili.bakery.view.util.Constants;

import java.sql.SQLOutput;

public class LoopServiceImpl implements LoopService {
    private boolean isWorking = true;
    private final InOutService consoleService;
    private final CommandService commandService;

    public LoopServiceImpl(InOutService consoleService, CommandService commandService) {
        this.consoleService = consoleService;
        this.commandService = commandService;
    }

    @Override
    public void startLoop() {
        consoleService.produceOutput(Constants.GREETING);
        while (isWorking) {
            consoleService.produceOutput(Constants.MAIN_MENU);
            String input = consoleService.getInput();
            try {
                commandService.recogniseCommand(input);
            } catch (ExitException e) {
                this.stopLoop();
            } catch (WrongCommandException e) {
                consoleService.produceOutput(Constants.WRONG_COMMAND);
                continue;
            }
        }
    }

    @Override
    public void stopLoop() {
        isWorking = false;
        consoleService.produceOutput(Constants.BYE);
    }
}
