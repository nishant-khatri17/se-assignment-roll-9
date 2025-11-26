import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoApp {
    private static final String FILE_NAME = "tasks.txt";

    public String addTask(String task) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(task);
            return "Task '" + task + "' added.";
        } catch (IOException e) {
            return "Error saving task: " + e.getMessage();
        }
    }

    public List<String> getTasks() {
        List<String> tasks = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    tasks.add(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return tasks;
    }

    public static void main(String[] args) {
        TodoApp app = new TodoApp();
        
        if (args.length == 0) {
            System.out.println("To-Do List App Running");
            return;
        }

        String command = args[0];
        if ("add".equals(command) && args.length > 1) {
            System.out.println(app.addTask(args[1]));
        } else if ("list".equals(command)) {
            System.out.println(app.getTasks());
        } else {
            System.out.println("Usage: java TodoApp [add <task> | list]");
        }
    }
}
