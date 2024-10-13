package homework_4;

import java.util.Scanner;

public class Task3_eligible_toWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.println("You are not eligile to work here!");
        } else {
            System.out.println("Your are eligible to work here!");
        }
    }
}
