package homework_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4_FirstMultipleOfFive {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter items: ");
        String numbers = scanner.nextLine();
        String[] items = numbers.split(",");
        int CurrentValue = Integer.MIN_VALUE;

        for (int i = 0; i < items.length; i++) {
            items[i] = items[i].trim();
            CurrentValue = Integer.parseInt(items[i]);
            if (CurrentValue % 5 == 0) {
                System.out.println("The first nubmer divisible by 5 is: " + CurrentValue);
                break;
            }
        }
    }
}
