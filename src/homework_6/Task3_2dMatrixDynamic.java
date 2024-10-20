package homework_6;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task3_2dMatrixDynamic {
    public  static void main (String[] args) {
        Scanner ScannerRows = new Scanner(System.in);
        System.out.println("Enter rows count: ");
        int rows = ScannerRows.nextInt();

        Scanner ScannerColumns = new Scanner(System.in);
        System.out.println("Enter rows count: ");
        int columns = ScannerColumns.nextInt();

        Scanner ScannerElement = new Scanner(System.in);
        System.out.println("Enter element: ");
        String element = ScannerElement.nextLine();

        int matrix[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++){
            for (int n = 0; n < columns; n++){
                System.out.print(element);
            }
            System.out.println();
        }
    }
}
// Print elements of a given 2-d matrix with dynamic rows and
//columns taken from user input

// трябва да има скенър за инпут - два пъти - един за редовете и един з колоните
// трябва да имам два форлупа единия да принтира редовете други колоните
// те трябва да са вградени
// този за принтиране на редовете да е външния
// този за принтиране на колоните вътрешния
