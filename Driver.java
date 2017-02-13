import java.io.*;

public class Driver {

  NodeList initalList = new NodeList();

  public void readAndInsert(String word) {
    initalList.addNodeStart(word);
  }

  public void display() {
    System.out.println(initalList.display());
  }

  public static void main(String[] args) {
    Driver d = new Driver ();
    String outputFile = args[1];
    String inputFile = args[0];
    PrintWriter printWriter = null;
    BufferedReader bufferedreader = null;

    if (args.length != 2) {
      System.out.println("Wrong use of arguments");
      System.exit(0);
    }

    try{
      FileOutputStream file = new FileOutputStream(outputFile);
      FileReader input = new FileReader(inputFile);
      bufferedreader = new BufferedReader(input);
      printWriter = new PrintWriter(file);

      String line;
      while((line = bufferedreader.readLine()) != null) {
        d.readAndInsert(line);
      }
    }

    catch (IOException e) {
      e.getMessage();
    }

    d.display();
  }

}