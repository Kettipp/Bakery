package com.chantili.bakery.view.service.impl;

import com.chantili.bakery.view.service.InOutService;

import java.util.Scanner;

public class ConsoleService implements InOutService {
    private final Scanner scanner;

    public ConsoleService(Scanner scanner) {
        this.scanner = scanner;
    }


    @Override
    public String getInput() {
        return scanner.nextLine();
    }

    @Override
    public void produceOutput(String message) {
        System.out.println(message);
    }
}
