import java.io.File;

class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.fiaimport java.io.File;
import java.io.IOException;

class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) throws IOException {
        file = new File(filePath);
        if (!file.exists()) {
            throw new IOException("File not found: " + filePath);
        }
        events.notify("open", file);
    }

    public void saveFile() throws IOException {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new IOException("Please open a file before saving.");
        }
    }
}
le = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
