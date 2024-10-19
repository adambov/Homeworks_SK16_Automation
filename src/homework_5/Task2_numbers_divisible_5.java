package homework_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task2_numbers_divisible_5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array items: ");

        String items = scanner.nextLine();
        String[] numbers = items.split(",");
        int CurrentValue = 0;
        ArrayList<Integer> DivisibleByFive = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i].trim();
            CurrentValue = Integer.parseInt(numbers[i]);
            if (CurrentValue > 150){
                break;
            }
            if (CurrentValue % 5 == 0 && CurrentValue <= 150) {
                DivisibleByFive.add(CurrentValue);
            }
        }
        System.out.println(DivisibleByFive);

    }
}


