package homework_6;

import java.util.*;

public class Task6_lotteryNumber {
    public static void main(String[] arg) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter list of number");
        String input = scanner1.nextLine().toLowerCase();
        String[] SplitedInput = input.split(" ");
        ArrayList<String> LotteryList = new ArrayList<>();

        for (String task : SplitedInput) {
            LotteryList.add(task);
        }

        if (input.equalsIgnoreCase("stop")) {
            System.out.println("This is keyword for stopping the program and you can use it only for this");
        }

        while (!input.equalsIgnoreCase("stop")) {

            System.out.println("Enter action: ");
            input = scanner1.nextLine().toLowerCase();


            if (!input.equals("add") && !input.equals("remove") && !input.equals("show") && !input.equals("stop")) {
                System.out.println("Action not possible");
                continue;
            }
            switch (input) {
                case "add":
                    System.out.println("Enter number: ");
                    input = scanner1.nextLine();
                    String AddNum = input;
                    if (!LotteryList.contains(AddNum)){
                        LotteryList.add(AddNum);
                    } else {
                        System.out.println("Congratulations you won the lottery");
                    }
                    break;
                case "remove":
                    System.out.println("Enter number: ");
                    input = scanner1.nextLine();
                    String RemovedNum = input;
                    LotteryList.remove(RemovedNum);
                    break;
                case "show":
                    System.out.println(LotteryList);
                    break;
                case "stop":
                    System.out.println("Game stopped" + " Winning numbers are: " + LotteryList);
                    break;
                default:
                    System.out.println("Action not possible");
                    break;

            }

        }
    }
}

//Create and manage a list of lottery numbers. This exercise allows users to
//add lottery numbers, view the list of winning numbers, and check if a specific
//number is a winning number


