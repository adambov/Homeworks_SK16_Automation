package homework_4;

import java.util.Scanner;

public class Task6_leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0) && (year % 100 > 0)) {
            System.out.println("Leap year");
        } else if (year % 400 == 0)
            System.out.println("Leap year");
        else {
            System.out.println("Not a leap year");
        }

    }
}
//A leap year must be divisible by 4, and not divisible by 100 unless is
//divisible by 400.

//първо проверявам дали годината се дели на 4 и на 100
// ако се дели на 4 и не се дели на 100, значи е четна
// но имам изключение, че ако се дели на 400
// в тези случаи годината е четна
// във всички други е нечетна