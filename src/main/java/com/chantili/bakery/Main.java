package com.chantili.bakery;

import com.chantili.bakery.view.service.CommandService;
import com.chantili.bakery.view.service.InOutService;
import com.chantili.bakery.view.service.LoopService;
import com.chantili.bakery.view.service.impl.ConsoleCommandService;
import com.chantili.bakery.view.service.impl.ConsoleService;
import com.chantili.bakery.view.service.impl.LoopServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InOutService console = new ConsoleService(scanner);
        CommandService commandService = new ConsoleCommandService();
        LoopService loopService = new LoopServiceImpl(console, commandService);
        loopService.startLoop();

    }
}
