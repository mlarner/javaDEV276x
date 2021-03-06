//DEV 276x EDX Java Course Module 2 Project
//Max Larner
//15min to complete

import java.util.*;

public class OddsAndEvens {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lets play a game called \" Odds and Evens \"");
        System.out.println("What's your name?");
        String name = input.nextLine();

        System.out.println("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
        String choice = input.nextLine();

        if (choice.equals("O")) {
            System.out.println(name + " has picked Odds! The computer will be Evens");
        } else if (choice.equals("E")) {
            System.out.println(name + " has picked Evens! The computer will be Odds");
        } else {
            System.out.println("Invalid option, try again");
        }

        System.out.println("-----------------------------------------");

        System.out.println("How many fingers do you hold out?");
        int humanFingers = input.nextInt();

        Random rand = new Random();
        int computerFingers = rand.nextInt(6);

        System.out.println("Computer throws out " + computerFingers);

        System.out.println("-----------------------------------------");

        int sum = humanFingers + computerFingers;

        boolean oddOrEven = sum % 2 == 0;

        System.out.println("-----------------------------------------");

        System.out.println(humanFingers + " + " + computerFingers + " = " + sum);

        if (oddOrEven == true) {
            System.out.println(sum + " is ... even!");
            if (choice.equals("E")) {
                System.out.println("That means " + name + " wins!!!");
            } else {
                System.out.println("That means the computer wins!!!");
            }
        } else {
            System.out.println(sum + " is ... odd!");
            if (choice.equals("O")) {
                System.out.println("That means " + name + " wins!!!");
            } else {
                System.out.println("That means the computer wins!!!");
            }
        }

        System.out.println("-----------------------------------------");
    }

}
