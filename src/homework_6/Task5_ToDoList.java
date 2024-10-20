package homework_6;

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

        for (String task : tasks) {
            Todo.add(task);
        }

        System.out.println("add, remove or finish a task: ");
        String action = scanner1.nextLine();

        System.out.println("Enter a new task: ");

            if (action.equals("add")) {

                String NewAction = scanner1.nextLine();
                Todo.add(NewAction);

            } else if (action.equals("remove")) {

                String RemovedTask = scanner1.nextLine();
                Todo.remove(RemovedTask);

            } else if (action.equals("finish")) {

                String CompletedTask = scanner1.nextLine();
                isFinished = true;
                Todo.set(Todo.indexOf(CompletedTask), "*" + CompletedTask + "*");
                System.out.println(CompletedTask + " is finished.");
            }
        System.out.println(Todo);
        }

        }
