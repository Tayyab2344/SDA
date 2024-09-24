// Class generating complete info
class Main {
 
  private String content;

  public Report(String content) {
      this.content = content;
  }

  public String generate() {
      return "Report Content: " + content;
  }
  public void saveToFile(String content, String fileName) throws IOException {
    FileWriter writer = new FileWriter(fileName);
    writer.write(content);
    writer.close();
}



