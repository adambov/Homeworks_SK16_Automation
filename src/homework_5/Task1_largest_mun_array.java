package homework_5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_largest_mun_array {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of array items: ");
        int count = scanner.nextInt();

        int biggest_number = Integer.MIN_VALUE;

        int[] all_numbers = new int[count];
        System.out.println("Enter a number: ");
            for (int i = 0; i < count; i++) {

                all_numbers[i] = scanner.nextInt();
                System.out.println("Enter a number: ");

            }
            for (int n = 0; n < count; n++) {
                if ( all_numbers[n] > biggest_number) {
                    biggest_number = all_numbers[n];
                }
            }
        System.out.println(Arrays.toString(all_numbers));
        System.out.println(biggest_number);
    }
}

//alternatevily
//int[] numbers = {1, 2, 3, 4, 5};
//
//int min = Math.min(numbers);
//
//System.out.println("The minimum number is: " + min);
