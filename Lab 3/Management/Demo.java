import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        
        // Adding listeners
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        editor.events.subscribe("save", new SmsNotificationListener("123-456-7890"));
        
        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
