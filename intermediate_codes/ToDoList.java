package intermediate_codes;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n📋 To-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("✅ Task added!");
                    break;
                case 2:
                    System.out.println("\nYour To-Do List:");
                    if (tasks.isEmpty()) {
                        System.out.println("❌ No tasks found.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter task number to remove: ");
                    int index = sc.nextInt();
                    if (index > 0 && index <= tasks.size()) {
                        tasks.remove(index - 1);
                        System.out.println("🗑️ Task removed.");
                    } else {
                        System.out.println("❌ Invalid task number.");
                    }
                    break;
                case 4:
                    System.out.println("👋 Exiting To-Do List. Bye!");
                    break;
                default:
                    System.out.println("❗ Invalid choice. Try again.");
            }
        } while (choice != 4);
    }
}


// javac intermediate_codes/ToDoList.java
// java intermediate_codes.ToDoList

