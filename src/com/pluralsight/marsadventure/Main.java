package com.pluralsight.marsadventure;

public class Main {

    public static void main(String[] args) {
    GameImpl gameImpl = new GameImpl();

    gameImpl.userNamePrompt();
    gameImpl.isExcitedPrompt();
    gameImpl.packing();
    gameImpl.animalInfo();
    gameImpl.interiorDesign();
    gameImpl.gameEnding();
    }
}