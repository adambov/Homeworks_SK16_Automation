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

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("add, remove or finish a task: ");
        String action = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter a new task: ");

            if (action.equals("add")) {

                String NewTask = scanner3.nextLine();
                Todo.add(NewTask);

            } else if (action.equals("remove")) {

                String RemovedTask = scanner3.nextLine();
                Todo.remove(RemovedTask);

            } else if (action.equals("finish")) {

                String CompletedTask = scanner3.nextLine();
                isFinished = true;
                Todo.set(Todo.indexOf(CompletedTask), "*" + CompletedTask + "*");
                System.out.println(CompletedTask + " is finished.");


            } else {
                System.out.println("invalid input!");
            }
            System.out.println(Todo);
        }
    }
