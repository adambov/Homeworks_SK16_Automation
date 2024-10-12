package homework_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        System.out.println("Enter first angle");
        Float angle_1 = one.nextFloat();

        Scanner two = new Scanner(System.in);
        System.out.println("Enter second angle");
        Float angle_2 = two.nextFloat();

        Scanner three = new Scanner(System.in);
        System.out.println("Enter third angle");
        Float angle_3 = three.nextFloat();

        Float sum = angle_1 + angle_2 + angle_3;

        if (sum < 180 || sum > 180) {
            System.out.println("The triangle can’t be built based on the angle values");
        } else {
            if (angle_1 == 90 || angle_2 == 90 || angle_3 == 90) {
                System.out.println("The triangle is right-angled");
            } else if (angle_1 < 90 && angle_2 < 90 && angle_3 < 90) {
                System.out.println("The triangle is acute "); // остроъгълен
            } else if (angle_1 > 90 || angle_2 > 90 || angle_3 > 90) {
                System.out.println("The triangle is obtuse"); // тъпоъгълен
            }
        }

        if (angle_1 == 60 && angle_2 == 60 && angle_3 == 60 ) {
            System.out.println("The triangle is equilateral"); // равностранен
        } else if ((angle_1.equals(angle_2) && angle_1 != angle_3) || (angle_2.equals(angle_3) && angle_2 != angle_1) || (angle_1.equals(angle_3) && angle_1 != angle_2)) {
            System.out.println("The triangle is isosceles "); // равнобедрен
        } else {
            System.out.println("The triangle is multifaceted"); // разностранен
        }
        }

    }
    //(angle_1 == angle_2 && angle_1 != angle_3) || (angle_2 == angle_3 && angle_2 != angle_1) || (angle_1 == angle_3 && angle_1 != angle_2)
//
//
//
//// 1. трябва да 3 последователни инпута един след друг
//// те да са в 3 различни променливи
//// 2. трябва направя променлива, която да съхранява сбора на 3-те инпута
//// 3. трябва да направя проверка - ако сбора на трите ъгъла е по-голяма от 180
//// или по-малък от 180 - програмата приключва и изписва, че няма такъв триъгълник
////
//
//// ако сбора на променливата е равна на 180 тогава:
//
//// правя проверка дали е тъпоъгълен - това е ако един от ъглите > 90
//// правя проверка дали е остроъгълен това е ако всички ъгли са < 90
//// правоъгълен проверявам дали е - това е когато поне един ъгъл е = 90
//
//// Равностранен триъгълник: Всички ъгли са 60 градуса.
//// Равнобедрен триъгълник: Два ъгъла са равни.
//// Разностранен триъгълник: Всички ъгли са различни

