import java.io.File;

class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Log to file " + log.getPath() + ": Someone performed the " + eventType + " operation on the file: " + file.getName());
    }
}
