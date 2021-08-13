package com.pluralsight.marsadventure;

import java.util.Scanner;

public class GetUserName {
    private static final Scanner scanner = new Scanner(System.in);

    public static String retrieveUserName() {
        System.out.println("Hi there. What's your name?");
        String userName = scanner.nextLine();

        if (userName.isEmpty()) {
            System.out.println("Oops! It looks like you didn't enter your name. You must type your name before you can continue with the game.");
            retrieveUserName();
        }

        return "Hi, " + userName.trim() + " --- Welcome to the mars adventure game. Yesterday, you received" +
                "a call from your good friend at NASA. They need someone to go to Mars this weekend, and you've been chosen.";
    }
}
