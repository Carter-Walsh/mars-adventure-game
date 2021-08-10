package com.pluralsight.marsadventure;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class GameImpl {
    final Scanner scanner = new Scanner(System.in);
    private String userName;
    private String animalName;


    public void getUserName() {
        System.out.println("Hi there. What's your name?");

        while (true) {
            userName = scanner.nextLine();

            if (!userName.trim().equals("")) {
                System.out.println("Hi, " + userName + " --- Welcome to the mars adventure game. Yesterday, you received" +
                        "a call from your good friend at NASA. They need someone to go to Mars this weekend, and you've been chosen.");
                break;
            } else {
                System.out.println("Oops! It looks like you didn't enter your name. You must type your name before you can continue with the game.");
            }
        }
    }

    public void isExcited() {
        System.out.println("Are you excited? Y/N");
        String response = scanner.nextLine().toLowerCase();

        while (true) {

            if (response.equals("y")) {
                System.out.println("I knew you'd say that. It's so cool that you're going to Mars!");
                break;
            } else if (response.equals("n")) {
                System.out.println("Aww... I'm sorry you aren't excited to go to Mars. But you're going anyway :)");
                break;
            } else {
                System.out.println("Oops! It looks like you might have pressed the wrong key.\n" +
                        "Make sure you only enter either 'y' for yes or 'n' for no");
            }
            response = scanner.nextLine().toLowerCase();
        }
    }

    public void packing() {
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
                    System.out.println("Great job packing!");
                    scanner.nextLine();
                    break;
                }

            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Oops! Invalid input. Make sure you only input integers.");
            }
        }
    }

    public void animalInfo() {
        System.out.println("You're allowed to bring one companion animal with you.");

        String animalKind;
        System.out.println("What kind of companion animal would you like to bring?");
        while (true) {
            animalKind = scanner.nextLine();

            if (!animalKind.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Oops! Looks like you didn't input anything. Make sure to include what kind of animal you will be bringing.");
            }
        }

        System.out.println("What is your companion's name?");
        while (true) {
            animalName = scanner.nextLine();

            if (!animalName.trim().isEmpty()) {
                System.out.println("Cool, so you're bringing " + animalName + " the " + animalKind);
                break;
            } else {
                System.out.println("Oops! Looks like you didn't input the animal name. Make sure to include what the name of your animal is.");
            }
        }
    }

    @SuppressWarnings("IfCanBeSwitch")
    public void interiorDesign() {
        System.out.println("NASA has a interior design team offering to outfit your space ship.\n" +
                "You have a couple of options for the interior decor of your ship.");

        System.out.println("""
                Your options are:
                 A:  Sleek, modern minimalism
                 B:  Retro/vintage space age
                 C:  SF Hippie chic
                Which decor would you like? Choose A, B, or C.""");

        while (true) {
            String userDesignResponse = scanner.nextLine().toLowerCase(Locale.ROOT);

            if (userDesignResponse.equals("a")) {
                System.out.println("Great choice! You are going to love the sleek look!");
                break;
            } else if (userDesignResponse.equals("b")) {
                System.out.println("Wow, that retro vintage look will be great!");
                break;
            } else if (userDesignResponse.equals("c")) {
                System.out.println("Man, flashback to the hippie chic look!");
                break;
            } else {
                System.out.println("Oops! It looks you didn't choose an appropriate option. Make sure to select either A, B or C.");
            }

        }
    }

    public void gameEnding() {
        System.out.println(userName + " the day is here!!\n" +
                "You crawl into the spaceship with " + animalName + "\n" +
                "Brace for take off!\n" +
                "5 ...\n" +
                "4 ...\n" +
                "3 ...\n" +
                "2 ...\n" +
                "1 ...\n" +
                "* LIFTOFF *");
    }
}