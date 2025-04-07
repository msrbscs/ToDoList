package com.msrbscs;
import java.util.ArrayList;
import java.util.List;



// TaskList.java
// This class manages a list of tasks, allowing for adding and marking tasks as complete.
// It uses the Task class to represent individual tasks.

// The Task class represents a single task with a description and a completion status.
// It provides methods to get the task description, check if it's completed, and mark it as completed.


public class TaskList {
    // List to store Task objects
    private List<Task> tasks;


    // Constructor initializes a new tasks list
    public TaskList() {
        tasks = new ArrayList<>();
    }  

    // Method to add a task to the list
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Method to display all tasks in the list
    public void displayTasks() {
        System.out.println("Task List:");
    //loop through each task in the list and print its description and completion status
        for (Task task : tasks) {
            System.out.println("- " + task.getDescription() + (task.isCompleted() ? " [Completed]" : ""));
        }
    }
    // Method to mark a task as completed based on its description
    public void markComplete(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                task.markAsCompleted();
                System.out.println("Task marked as completed: " + description);
                return;
            }
        }
        System.out.println("Task not found: " + description);

    }
    // Method to change the description of a task based on its old description
    public void changeTaskDescription(String oldDescription, String newDescription) {
        for (Task task : tasks) {
            if (task.getDescription().equals(oldDescription)) {
                task.setDescription(newDescription);
                System.out.println("Task updated");                
                return;
            }
        }
        System.out.println("Task not found: " + oldDescription);
    }
    // Method to remove a task from the list based on its description
    public void removeTask(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                tasks.remove(task);
                System.out.println("Task removed: " + description);
                return;
            }
        }
        System.out.println("Task not found: " + description);
    }
   
}
