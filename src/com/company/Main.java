package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome! Place your bet! ");
        int total_bank_roll = 100;
        int amount_bet = 0;
        boolean user = true;
        String type_of_bet = " ";
        int games_won = 0;
        int games_lost = 0;
        do {

            Scanner keyboard = new Scanner(System.in);
            Random rand = new Random();

            System.out.println("Enter the type of bet you would like to place (red|black|even|odd|high|low): ");
            type_of_bet = keyboard.next();
            System.out.println("You bet on " + type_of_bet);

            System.out.println("How much do you bet?");
            amount_bet = keyboard.nextInt();
            if (amount_bet <= total_bank_roll)
                System.out.println("Amount bet is :" + amount_bet);
            total_bank_roll = (total_bank_roll - amount_bet);
            System.out.print("You have " + total_bank_roll);
            System.out.println(" Dollars Left in your bank roll");
            //  else
            //      System.out.println("Sorry no credit");
            //  System.exit(0);


            // int color = 1 + rand.nextInt(2);
            // int odd_even = 1 + rand.nextInt(2);
            // int high_low = 1 + rand.nextInt(2);


            String[] color = {"Red", "Black"};
            String[] odd_even = {"Odd", "Even"};
            String[] high_low = {"High", "Low"};


            int index = rand.nextInt(color.length);
//            System.out.println(color[index]);


            System.out.println("The ball landed on " + color[index]);

            System.out.println("You bet on  " + type_of_bet);
            if (color[index].equalsIgnoreCase(type_of_bet)) {
                System.out.println("You win");
            } else {
                System.out.println("You lose");

                System.out.println("Would you like to play again (true|false)?");
            }if (user == true) {
                    System.out.println("next roll");
                } else {
                    System.out.println("Thank you for playing");
                    System.exit(0);
                }
            }
            while (amount_bet > 0) ;

        }
    }


