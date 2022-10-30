package com.chantili.bakery.view.service.impl;

import com.chantili.bakery.view.exception.ExitException;
import com.chantili.bakery.view.exception.WrongCommandException;
import com.chantili.bakery.view.service.CommandService;

public class ConsoleCommandService implements CommandService {


    @Override
    public void recogniseCommand(String command) throws ExitException, WrongCommandException {
        if (command.equals("1")) {

        } else if (command.equals("2")) {

        } else if (command.equals("3")) {

        } else if (command.equals("4")) {
            throw new ExitException();
        } else {
            throw new WrongCommandException();
        }
    }


}

