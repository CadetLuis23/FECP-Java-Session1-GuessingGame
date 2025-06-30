package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int secretNumber = (int)(Math.random() * 5) + 1;
        int guess = -1;

        Scanner sc = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 5");
        for (int i = 0; i < 3; i++){
            System.out.printf("Guess %d: ", i+1);
            guess = sc.nextInt();
            if (guess == secretNumber){
                System.out.print("You guessed it!\nYou Win!");
                break;
            }
            if ( i < 2)System.out.println("Wrong guess.");
            else System.out.printf("You lose, The correct number was %d%n", secretNumber);
        }
    }
}