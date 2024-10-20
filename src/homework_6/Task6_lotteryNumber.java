package homework_6;

import java.util.*;

public class Task6_lotteryNumber {
    private List<Integer> lotteryNumbers;

    public Task6_lotteryNumber() {
        lotteryNumbers = new ArrayList<>();
    }

    public void addLotteryNumber(int number) {
        if (lotteryNumbers.contains(number)) {
            System.out.println("Number already exists in the list.");
        } else {
            lotteryNumbers.add(number);
            System.out.println("Number added successfully.");
        }
    }

    public void viewLotteryNumbers() {
        System.out.println("Your lottery numbers:");
        for (int number : lotteryNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public boolean isWinningNumber(int number) {
        return lotteryNumbers.contains(number);
    }

    public static void main(String[] args) {
        Task6_lotteryNumber manager = new Task6_lotteryNumber();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add lottery number");
            System.out.println("2. View lottery numbers");
            System.out.println("3. Check winning number");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter lottery number: ");
                    int numberToAdd = scanner.nextInt();
                    manager.addLotteryNumber(numberToAdd);
                    break;
                case 2:
                    manager.viewLotteryNumbers();
                    break;
                case 3:
                    System.out.print("Enter number to check: ");
                    int numberToCheck = scanner.nextInt();
                    boolean isWinning = manager.isWinningNumber(numberToCheck);
                    if (isWinning) {
                        System.out.println("It's a winning number!");
                    } else {
                        System.out.println("It's not a winning number.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");

                    break;
            }
        }
    }
}