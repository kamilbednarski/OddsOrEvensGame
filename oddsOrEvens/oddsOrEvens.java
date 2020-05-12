package oddsOrEvens;

import java.util.Random;
import java.util.Scanner;

public class oddsOrEvens {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Let's play a game called \"Odds and Evens \"");
        System.out.print("What's your name? ");
        String playersName = input.nextLine();
        System.out.println("Hello " + playersName + "!");
        gameBody(playersName);
        System.out.print("Do you want to play again? Y/N ");
        int i = 0;
        while (i == 0) {
            String replayChoice = input.next();
            if (replayChoice.equals("Y") || replayChoice.equals("y")) {
                gameBody(playersName);
                System.out.println("Do you want to plan again? Y/N ");
            }
            else {
                System.out.println("Thanks for the game! See you next time. ");
                break;
            }

        }



    }


    public static void gameBody(String name) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String space = "---------------------------------------------------------";

        //Getting player's choice.
        System.out.print("Which side do you choose? (O)dds or (E)vens? ");
        String playersChoice = input.next();
        if (playersChoice.equals("O") || playersChoice.equals("o")) {
            System.out.println(name + " has chosen odds! The computer will be evens.");
            playersChoice = "odds";
        }
        else if (playersChoice.equals("E") || playersChoice.equals("e")) {
            System.out.println(name + " has chosen evens! The computer will be odds.");
            playersChoice = "evens";
        }
        else {
            System.out.println("There's no such choice. Please start again");
            return;
        }
        System.out.println(space);
        System.out.println();

        //Asking player about the number of fingers.
        System.out.print("How many fingers do you put out? ");
        int playersFingers = input.nextInt();
        System.out.println("You laid out " + playersFingers + " fingers.");

        //Printing out computer's choice.
        int computersFingers = randomInt(1, 5);
        System.out.println("Computer puts out " + computersFingers + " fingers.");
        System.out.println(space);
        System.out.println();

        //Printing results.
        int combinedNumber = computersFingers + playersFingers;
        System.out.println(playersFingers + " + " + computersFingers + " = " + combinedNumber);
        if (combinedNumber % 2 == 0) {
            System.out.println(combinedNumber + " is ...even!");
            if (playersChoice.equals("evens"))
                System.out.println(name + " wins! ");
            else
                System.out.println("Computer wins! ");
        }
        else {
            System.out.println(combinedNumber + " is ...odd!");
            if (playersChoice.equals("odds"))
                System.out.println(name+ " wins! ");
            else
                System.out.println("Computer wins! ");
        }
        System.out.println(space);
        System.out.println();






    }
    public static int randomInt(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1) + min;
        return randomNumber;
    }
}
