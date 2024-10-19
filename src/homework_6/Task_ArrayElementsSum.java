package homework_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task_ArrayElementsSum {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list:");
        String items = scanner.nextLine();
        String[] SplitedItems = items.split(" ");


        ArrayList numbers = new ArrayList();
        int CurrentValue;
        int sum = 0;


        for (int i = 0; i < SplitedItems.length; i++) {
            CurrentValue = Integer.parseInt(SplitedItems[i]);
            numbers.add(CurrentValue);
            sum += CurrentValue;
        }



        System.out.println("The sum of the numbers in the array is: " + sum);
    }
}
