package homework_6;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Scanner;

public class Task5_ToDoList {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Crate a Todo List: ");
        String input = scanner1.nextLine();
        String[] tasks = input.split(", ");

        ArrayList<String> Todo = new ArrayList<>();
        boolean isFinished = false;
        String state = "is finished";

        for (String task : tasks) {
            Todo.add(task);
        }
//        System.out.println(Todo);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("add, remove or finish a task: ");
        String action = scanner1.nextLine();

        if (action.equals("add")) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter a new task: ");
            String NewTask = scanner3.nextLine();
            Todo.add(NewTask);
            scanner3.close();
        } else if (action.equals("remove")) {
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Remove a task: ");
            String RemovedTask = scanner4.nextLine();
            Todo.remove(RemovedTask);
            scanner4.close();
        } else if (action.equals("finish")) {
            Scanner scanner5 = new Scanner(System.in);
            System.out.println("Finish a task: ");
            String CompletedTask = scanner5.nextLine();
            isFinished = true;
            Todo.set(Todo.indexOf(CompletedTask), "*" + CompletedTask + "*");
            System.out.println(CompletedTask + " is finished.");
            scanner5.close();

        } else {
            System.out.println("invalid input!");
        }
        System.out.println(Todo);
    }
}
// трябва да направя ТоДу лист
// трябва да може юзъра да добавя таскове
// да премахва таскове
// да ги маркира като завършени
// да принтира новото състояние на листа

// за целта ми трябва скенър, и иф условие, което да търси думите:
//add, remove, completed

//        while (action.equals("add")) {
//            Scanner scanner2 = new Scanner(System.in);
//            System.out.println("Enter a task: ");
//            String NewAction = scanner2.nextLine();
//            Todo.add(NewAction);
//            if (NewAction.equals("stop")) {
//                System.out.println(Todo);
//                    continue;
//            }
//            if (NewAction.equals("remove")) {
//                Scanner scanner3 = new Scanner(System.in);
//                System.out.println("Remove a task: ");
//                String RemovedTask = scanner3.nextLine();
//                Todo.remove(RemovedTask);
//                scanner3.close();
//
//            }
//            if (NewAction.equals("complete")) {
//                Scanner scanner4 = new Scanner(System.in);
//                System.out.println("Complete a task: ");
//                String CompletedTask = scanner4.nextLine();
//                boolean isCompleted = true;
//                String completed = "is Done";
//                System.out.println(CompletedTask + completed);
//                scanner4.close();
//            }
//            System.out.println(Todo);
//        }