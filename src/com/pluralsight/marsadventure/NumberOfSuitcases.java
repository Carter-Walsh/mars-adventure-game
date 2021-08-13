package com.pluralsight.marsadventure;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOfSuitcases {

    public static String getNumberOfSuitcases() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("It's time to pack for your trip.\n" +
                "How many suitcases do you plan to bring?");

        while (true) {
            try {
                int numberOfSuitcases = scanner.nextInt();

                if (numberOfSuitcases > 2) {
                    System.out.println("That's way too many. You'll have to pack more lightly.\n" +
                            "Please try to fit your stuff into 2 suitcases. " +
                            "Try repacking your stuff and then enter your new number of suitcases.");
                } else if (numberOfSuitcases == 0) {
                    System.out.println("You won't be able to survive without luggage.\n" +
                            "You need at least one suitcase. Please pack something and enter your new number of suitcases.");
                } else if (numberOfSuitcases < 0) {
                    System.out.println("That's not a valid number. Please make sure the number of suitcases you enter is above 0.");
                } else {
                    scanner.nextLine();
                    return "Great job packing!";
                }

            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Oops! Invalid input. Make sure you only input integers.");
            }
        }
    }
}
