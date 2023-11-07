package com.mycompany;

import java.util.Scanner;

public class Main {
    public static String getUserInput(String msg, Scanner scanner) {
        if (msg != null) {
            System.out.println(msg);
        }

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                System.out.println("The input was blank.");
                continue;
            }

            return input;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player trickOrTreater = new Player();

        int housesToVisit;

        trickOrTreater.setName(getUserInput("What is your name?: ", scanner));
        trickOrTreater.setCostume(getUserInput("What are you dressed up as?: ", scanner));

        while (true) {       
            try {
                housesToVisit = Integer.parseInt(getUserInput("How many house do you want to visit?", scanner));
                trickOrTreater.trickOrTreat(housesToVisit);
                break;
            } catch (Exception e) {
                System.out.println("Please enter a whole number.");
            }
        }

    }
}
