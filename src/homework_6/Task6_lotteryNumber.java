package homework_6;

import java.util.*;

public class Task6_lotteryNumber {
    public static void main (String[] arg){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter list of number");
        String input = scanner1.nextLine().toLowerCase();
        String[] SplitedInput = input.split(" ");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (String n  : SplitedInput) {
            int num = Integer.parseInt(n);
            numbers.add(num);
        }

        System.out.println("Enter action: ");
        String action = scanner1.nextLine().toLowerCase();

        if (input.equalsIgnoreCase("stop")){
            System.out.println("This is keyword for stopping the program and you can use it only for this");
        }

        while (!action.equalsIgnoreCase("stop")){
            Scanner scanner2 = new Scanner(System.in);
            if (!action.equals("add") && !action.equals("remove") && !action.equals("show") && !action.equals("stop")){
                System.out.println("Action not possible");
                continue;
            }
            if (action.equals("add")){
                System.out.println("Enter number: ");
                int AddNum = scanner2.nextInt();
                numbers.add(AddNum);
            } else if (action.equals("remove")) {
                System.out.println("Enter number: ");
                int AddNum = scanner2.nextInt();
                numbers.remove(AddNum);
            } else if (action.equals("show")) {
                System.out.println(numbers);
                break;
            }

        }
        System.out.println(numbers);
    }
}

//Create and manage a list of lottery numbers. This exercise allows users to
//add lottery numbers, view the list of winning numbers, and check if a specific
//number is a winning number