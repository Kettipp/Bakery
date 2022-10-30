package com.chantili.bakery.view.service;

import com.chantili.bakery.view.exception.ExitException;
import com.chantili.bakery.view.exception.WrongCommandException;
import com.chantili.bakery.view.service.impl.ConsoleService;

public interface CommandService {
    void recogniseCommand(String command) throws ExitException, WrongCommandException;
}
