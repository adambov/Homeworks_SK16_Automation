package homework_4;

import java.util.Scanner;

public class Task5_vacation {
    public static void main (String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter type of vacation: ");
        String type = scanner1.nextLine().toLowerCase().trim();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter daily budget: ");
        Float budget = scanner2.nextFloat();

        if (!type.equals("beach") && !type.equals("mountain")) {
            System.out.println("We have no information about such a vacation!");
        } else {
            if (type.equals("beach") && (budget < 50)) {
                System.out.println("With this budget you can afford Beach vacation in Bulgaria");
            } else if (type.equals("mountain") && (budget < 30)) {
                System.out.println("With this budget you can afford Mountain vacation in Bulgaria");
            } else {
                System.out.println("With budget " + budget + " you can afford " + type + " vacation in foreign country!");
            }
        }
    }
}

//инпут за Beach/Mountain
// трябва да има и инпут за бюджета той ще е във флоут
// ще има проверка за инпут за вида на почивката и ако нещо е различно
// ще трябва да върнем, че няма информация за този вид почивка
// правя и проверка за бюджет
// ако бюджета е < 50 и вида е beach  товага юзъра остава в България
// в противоположните случаи отива в чужбина
// ако бюджета е < 30 и вида е mountain  тогава юзъра си остава в България
// в противоположен случай отива в чужбина
