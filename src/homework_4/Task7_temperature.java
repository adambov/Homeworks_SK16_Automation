package homework_4;

import java.io.PrintStream;
import java.util.Scanner;

public class Task7_temperature {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter value");
        Float temperature = scanner1.nextFloat();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter C to F or F to C: ");
        String convert = scanner2.nextLine().toLowerCase().trim();

        Float c;
        Float f;

        if (convert.equals("c to f")) {
            f = (temperature * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is: " + f);

        } else {
            c = (temperature - 32) * 5 / 9;
            System.out.println("The temperature in Fahrenheit is: " + c);
        }
    }
}



// юзър инпут е температурата във флоут
// юзър инпут е от C във F или обратното
// условие ако е от C във F
// ползвам формулата °F = (°C × 9/5) + 32
// в противния случай ползвам °C = (°F - 32) × 5/9
// принтирам резултата