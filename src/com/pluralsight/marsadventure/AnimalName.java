package com.pluralsight.marsadventure;

import java.util.Scanner;

public class AnimalName {

    public static String getAnimalName(String animalKind) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your " + animalKind + "'s name?");
        String animalName = scanner.nextLine();

        while (true) {
            if (!animalName.isEmpty()) {
                System.out.println("Oops! Looks like you didn't input the animal name. Make sure to include what the name of your animal is.");
                break;
            }
        }

        return "Cool, so you're bringing " + animalName + " the " + animalKind;
    }
}
