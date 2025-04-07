package com.msrbscs;

public class Task {
    private String description;
    private boolean completed;
   
    // C.R.U.D.

    //Create
    // Constructor to initialize a task with a description and set it as not completed
    public Task (String description) {
        this.description = description;
        this.completed = false;
    }

    // Read
    // Get the task description
    public String getDescription() {
        return description;
    }

    // Update
    // Set a new description for the task
    // This method allows updating the task description
    public void setDescription(String description) {
        this.description = description;
    }

    // Check if the task is completed
    public boolean isCompleted() {
         return completed;
    }

    // Mark the task as completed
    public void markAsCompleted() {
         this.completed = true;
    }
}
