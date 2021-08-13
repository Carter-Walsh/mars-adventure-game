package com.pluralsight.marsadventure;

import java.util.Scanner;

public class isExcited {

    public static String getIsExcitedResponse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you excited? Y/N");
        String response = scanner.nextLine().toLowerCase();

        while (true) {
            if (response.equals("y")) {
                return "I knew you'd say that. It's so cool that you're going to Mars!";
            } else if (response.equals("n")) {
                return "Aww... I'm sorry you aren't excited to go to Mars. But you're going anyway :)";
            } else {
                System.out.println("Oops! It looks like you might have pressed the wrong key.\n" +
                        "Make sure you only enter either 'y' for yes or 'n' for no");
            }
            response = scanner.nextLine().toLowerCase();
        }
    }
}
