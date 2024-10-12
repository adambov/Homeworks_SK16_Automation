package homework_4;

import java.util.Scanner;

public class Task2_week_days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = scanner.nextInt();
        String day = "";
        String letters;

        switch (number) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                System.out.println("Invalid number. Enter a number between 1 and 7.");
        }

        if (number % 10 == 1 && number != 11) {
            letters = "st";

        } else if (number % 10 == 2 && number != 12) {
            letters = "nd";

        } else if (number % 10 == 3 && number != 13) {
            letters = "rd";
        } else {
            letters = "th";
        }

        if (number >= 1 && number <= 7) {
            System.out.println("The " + number + letters + " day of the week is " + day);
        }
    }
}
//инпут за юзъра да въвежда числата от 1 до 7
// да си казва ако инпута е невалиден
//прочита инпута
//преценява дали към кой ден от седмицата съответства числото
//правя окончанията:
//Ако последната цифра е 1 и числото не е 11: Добавяме "st". Примери: 1-ви, 21-ви.
//Ако последната цифра е 2 и числото не е 12: Добавяме "nd". Примери: 2-ри, 22-ри.
//Ако последната цифра е 3 и числото не е 13: Добавяме "rd". Примери: 3-ти, 23-ти.
//Във всички останали случаи: Добавяме "th". Примери: 4-ти, 5-ти, 11-ти, 12-ти, 13-ти.
//правя си съответното съобщение (e.g., "The 3rd day of the week is Wednesday").
//принтирам съобщението