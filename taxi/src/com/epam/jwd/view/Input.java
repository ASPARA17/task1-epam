package com.epam.jwd.view;

import java.util.Scanner;

public class Input {
    private static Scanner scan = new Scanner(System.in);

    public static int inputInt(String str) {
        System.out.println(str);
        int number;
        do {
            while (!scan.hasNextInt()) {
                System.out.println("That not a number!");
                scan.next();
            }
            number = scan.nextInt();
        } while (number < 0);
        return number;
    }

    public static String inputString(String str) {
        System.out.println(str);
        return scan.next();
    }
}
