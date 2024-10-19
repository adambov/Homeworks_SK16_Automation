package homework_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task5_SkipDivisibleBy_3 {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of number: ");
        String numbers = scanner.nextLine();

        String[] items = numbers.split(",");
        ArrayList NewList = new ArrayList();
        int CurrentValue = Integer.MIN_VALUE;

        for (int i = 0; i < items.length; i++) {
            items[i] = items[i].trim();
            CurrentValue = Integer.parseInt(items[i]);
                if (CurrentValue % 3 != 0) {
                    NewList.add(CurrentValue);
                }
        }
        System.out.println(NewList);

        // трябва от настоящия стрингов арей да обърна числата в инт, създаваки променлива за инт
        // от тях със фор луп и иф стейтмънт да преценя, кои са делими на три
        // ако не са делими на 3 да ги добавя в нов арей и да го принтирам
    }
}
