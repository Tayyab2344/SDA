// Class only responsible for generating the report
import java.io.*;
class Report {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    public String generate() {
        return "Report Content: " + content;
    }
}

// Class responsible for saving the report to a file
class FileSaver {
    public void saveToFile(String content, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }
}


