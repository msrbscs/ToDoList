//To Do List Application
// This is a simple console-based To-Do List application in Java.
// Output and user input is taken from the console.

package com.msrbscs;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        System.out.println("Welcome to the To-Do List Application!");
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        // Create a TaskList object to manage tasks
        TaskList taskList = new TaskList();

        int choice = 0; //default choice variable set to 0

        // Loop continues until the user chooses to exit (option 6)
        // The loop will display the menu and prompt the user for input
        while (choice != 6) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Change Task Description");
            System.out.println("5. Remove Task");
            System.out.println("6. Exit");

            // Prompt the user for a choice and validate the input
            while (true) {
            // Take String input and parse to int
                try {
                    System.out.println("Enter your choice (1-6): ");
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice < 1 || choice > 6) {
            // Check if the choice is within the valid range (1-6)
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    } else {
            // Valid choice, exit the loop            
                        break; 
                    }
            // Handle invalid input (non-integer)
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 6.");
                }
            }
            
            // switch statement to handle user choices
            // Each case corresponds to a different action in the To-Do List application
            switch (choice) {
            // case 1: Add a new task               
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Task task = new Task(description);
                    taskList.addTask(task);
                    System.out.println("Task added: " + description);
                    break;
            // case 2: Display all tasks 
                case 2:
                    taskList.displayTasks();
                    break;
            // case 3: Mark a task as completed
                case 3:
                    System.out.print("Enter task description to mark as completed: ");
                    String completedDescription = scanner.nextLine();
                    taskList.markComplete(completedDescription);
                    break;
            // case 4: Change a task's description
                case 4:
                    System.out.print("Enter old task description: ");
                    String oldDescription = scanner.nextLine();
                    System.out.print("Enter new task description: ");
                    String newDescription = scanner.nextLine();
                    taskList.changeTaskDescription(oldDescription, newDescription);
                    break;
            // case 5: Remove a task
                case 5:
                    System.out.print("Enter task description to remove: ");
                    String removeDescription = scanner.nextLine();
                    taskList.removeTask(removeDescription);
                    break;
            // case 6: Exit the application
                case 6:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close(); // Close the scanner to prevent resource leaks
        // End of the application
    }
}