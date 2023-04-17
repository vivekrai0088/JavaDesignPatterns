package commandpattern;

public class DocumentClient {
  public static void main(String[] args) {
    Document document = new Document();
    Command saveCommand = new SaveCommand(document);
    Command openCommand = new OpenCommand(document);

    DocumentInvoker documentInvoker = new DocumentInvoker();
    documentInvoker.setCommand(saveCommand);
    documentInvoker.executeCommand();

    documentInvoker.setCommand(openCommand);
    documentInvoker.executeCommand();
  }
}
