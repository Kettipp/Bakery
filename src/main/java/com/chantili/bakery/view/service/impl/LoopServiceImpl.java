package com.chantili.bakery.view.service.impl;

import com.chantili.bakery.view.service.LoopService;

public class LoopServiceImpl implements LoopService {
    private boolean isWorking = true;
    private final ConsoleService consoleService;

    public LoopServiceImpl(ConsoleService consoleService) {
        this.consoleService = consoleService;
    }

    @Override
    public void startLoop() {
        while (isWorking) {

        }
    }

    @Override
    public void stopLoop() {
        isWorking = false;
    }
}
