package com.pluralsight.marsadventure;

import java.util.Scanner;

public class AnimalKind {

    public static String getAnimalKind() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You're allowed to bring one companion animal with you.\n" +
        "What kind of companion animal would you like to bring?");
        String animalKind = scanner.nextLine();

        while (true) {
            if (animalKind.isEmpty()) {
                System.out.println("Oops! Looks like you didn't input anything. Make sure to include what kind of animal you will be bringing.");
                animalKind = scanner.nextLine();
                continue;
            }
            break;
        }

        return animalKind.trim();
    }
}
