package com.chantili.bakery;

import java.util.Scanner;

public class Main {
    public static final String GREETING = "Hello, I have turned on :):";
    public static final String MAIN_MENU = """
            Main Menu: enter the command
            1.Create product.
            2.Take product.
            3.Put product.
            4.Exit.
            """;
    public static final String EXIT = "4";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println(GREETING);
            System.out.println(MAIN_MENU);
            String word = scanner.nextLine();
            if(word.equals(EXIT)) {
                break;
            }
        }
    }
}
