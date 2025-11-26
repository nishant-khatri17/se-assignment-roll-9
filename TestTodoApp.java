public class TestTodoApp {
    public static void main(String[] args) {
        TodoApp app = new TodoApp();
        
        // Test Logic
        String result = app.addTask("Buy Milk");
        
        // Assertions
        if (!result.contains("added")) {
            throw new RuntimeException("Test Failed: Output message incorrect.");
        }
        
        if (!app.getTasks().contains("Buy Milk")) {
            throw new RuntimeException("Test Failed: Task not stored in list.");
        }
        
        System.out.println("All Tests Passed!");
    }
}