package com.pluralsight.marsadventure;

import java.util.Locale;
import java.util.Scanner;

public class GameImpl {
    final Scanner scanner = new Scanner(System.in);
    private String animalName;

    public void userNamePrompt() {
        System.out.println(GetUserName.retrieveUserName());
    }

    public void isExcitedPrompt() {
        System.out.println(isExcited.getIsExcitedResponse());
    }

    public void packing() {
        System.out.println(NumberOfSuitcases.getNumberOfSuitcases());
    }

    public void animalInfo() {
        String animalKind = AnimalKind.getAnimalKind();
        System.out.println(AnimalName.getAnimalName(animalKind));
    }

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
        System.out.println("The day is here!!\n" +
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