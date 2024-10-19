package homework_5;

import java.io.SequenceInputStream;
import java.util.Scanner;

public class Task6_AverageOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array of numbers: ");
        String numbers = scanner.nextLine();
        String[] items = numbers.split(",");

        float CurrentNumber = 0;
        float sum = 0;
        float average = 0;


        for (int i = 0; i < items.length; i++) {
            CurrentNumber = Float.parseFloat(items[i]);
            sum += CurrentNumber;
        }

        average = sum / items.length;

        System.out.println(average);

        // имам вече инпут за стринг от числа
        // трябва да направя така че те да са цифри, но преди това да имам фор луп,
        // за този фор луп, за да му определя дължината
        // трябва да имам лентх,
        // за да имам лентх ми трябва да
        //отделя със запетая числата
        // това правя със сплит
        // дефинирам две променливи едната за сумата другата за изчисление на аверидж
        // правя фор луп по дължината на вече сплитнатия стринг т.е. айтъм
        // вътре в него първо превръщам всяко стрингово число в реален флоут и го събирам със следващото
        // накрая общия сбор от всички го деля на брийката на индексите
        // принтирам резултата

    }
}
