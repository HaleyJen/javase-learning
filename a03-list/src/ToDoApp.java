import java.util.ArrayList;

public class ToDoApp {
    public static void main(String[] args) {
        // 1. Create an ArrayList to store to-do items
        ArrayList<String> toDoList = new ArrayList<>();

        // 2. Add tasks
        toDoList.add("Buy groceries");
        toDoList.add("Finish homework");
        toDoList.add("Go for a walk");

        // 3. Print all tasks
        System.out.println("To-Do List:");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + ". " + toDoList.get(i));
        }

        // 4. Update a task
        toDoList.set(1, "Finish Java homework");

        // 5. Remove a task
        toDoList.remove("Go for a walk");

        // 6. Print updated list
        System.out.println("\nUpdated To-Do List:");
        for (String task : toDoList) {
            System.out.println("- " + task);
        }

        // 7. Check size
        System.out.println("\nTotal tasks: " + toDoList.size());
    }
}
