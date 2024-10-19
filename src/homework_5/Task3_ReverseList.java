package homework_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Task3_ReverseList {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter items: ");
        String numbers = scanner.nextLine();
        String[] items = numbers.split(",");
        ArrayList NewList = new ArrayList();
        int CurrentValue = Integer.MIN_VALUE;
        int BiggestValue = Integer.MIN_VALUE;

        for (int i = 0; i < items.length; i++) {
            items[i] = items[i].trim();
            CurrentValue = Integer.parseInt(items[i]);
            if (BiggestValue < CurrentValue) {
                BiggestValue = CurrentValue;
                NewList.add(0,BiggestValue);
            }
        }
        System.out.println(NewList);
    }
}
