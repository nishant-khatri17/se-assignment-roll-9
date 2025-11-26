import java.util.ArrayList;
import java.util.List;

public class TodoApp {
    private List<String> tasks = new ArrayList<>();

    public String addTask(String task) {
        tasks.add(task);
        return "Task '" + task + "' added.";
    }

    public List<String> getTasks() {
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