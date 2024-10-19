package homework_5;

import java.util.Random;
import java.util.Scanner;

public class Task7_RandomNumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int RandomNumberInRange = random.nextInt(100);

        int guess;

        do {
            System.out.println("Guess the number: ");
            guess = scanner.nextInt();

            if (guess < RandomNumberInRange) {
                System.out.println("Number is too low: ");
            } else if (guess > RandomNumberInRange) {
                System.out.println("Number is too high: ");
            }


        } while (guess != RandomNumberInRange);
        System.out.println("Congratulations! You guessed the number: " + RandomNumberInRange);
    }
}

