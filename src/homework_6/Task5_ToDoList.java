package homework_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5_ToDoList {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Crate a Todo List: ");
        String input = scanner1.nextLine().toLowerCase();
        String[] tasks = input.split(", ");

        ArrayList<String> Todo = new ArrayList<>();

        for (String task : tasks) {
            Todo.add(task);
        }
        if (input.equalsIgnoreCase("stop")){
            System.out.println("This is keyword for stopping the program and you can use it only for this");
        }
        while (!input.equalsIgnoreCase("stop")) {
            System.out.println("add, remove or finish a task: ");
            String action = scanner1.nextLine().toLowerCase();

            if (!action.equals("add") && !action.equals("remove") && !action.equals("finish") && !action.equals("stop")){
                System.out.println("Action not possible");
                continue;
            }
            if (action.equalsIgnoreCase("add")) {
                System.out.println("Enter the task");
                String NewAction = scanner1.nextLine().toLowerCase();
                Todo.add(NewAction);

            } else if (action.equalsIgnoreCase("remove")) {
                System.out.println("Enter the task");
                String RemovedTask = scanner1.nextLine().toLowerCase();

                if (!Todo.contains(RemovedTask)) {
                    System.out.println("Task \"" + RemovedTask + "\" does not exist.");
                    continue;
                }
                Todo.remove(RemovedTask);

            } else if (action.equalsIgnoreCase("finish")) {
                System.out.println("Enter the task");
                String CompletedTask = scanner1.nextLine().toLowerCase();

                    if (!Todo.contains(CompletedTask)){
                        System.out.println("Task \"" + CompletedTask + "\" does not exist.");
                        continue;
                    }
                Todo.set(Todo.indexOf(CompletedTask), "*" + CompletedTask + "*");
                System.out.println(CompletedTask + " is finished.");

            } else if (action.equalsIgnoreCase("stop")) {
                System.out.println(Todo);
                break;
            }

            System.out.println(Todo);
        }
    }
}



