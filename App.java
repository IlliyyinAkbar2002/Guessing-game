/**
 * To create a simple guessing game in Java, you will need to create a class
 * with a main method. Inside the main method, you will need to declare a
 * variable to store the user's guess, and then prompt the user for their guess.
 * Then, you will need to generate a random number and compare it to the user's
 * guess. If the user's guess is higher than the random number, print out "Too
 * high!" If the user's guess is lower than the random number, print out "Too
 * low!" If the user guesses correctly, print out "You guessed it!
 */ 

import java.util.Scanner;
import java.util.Random;

public class Guessing {
    public static void main(String[] args){

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        // Declare variables
        int numbertoguess = rand.nextInt(100) + 1;

        int guess;
        do{
            System.out.println("Guess a number a between 1 and 100:");
            guess = input.nextInt();
            if (guess < numbertoguess) {
                System.out.println("Your guess is too low, try again.");
            }else if(guess > numbertoguess){
                System.out.println("Your guess is too high, try again.");
            }
        }while(guess != numbertoguess);
        System.out.println("You guessed it! The number was " + numbertoguess);

        input.close();
    }
}
