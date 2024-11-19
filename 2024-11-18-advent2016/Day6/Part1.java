import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part1 {
  public static String decipherMessage(String filename) {
    String message = ""
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      input.close()
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return message;
    }

    public static void main(String[] args) {
      System.out.println(decipherMessage("inputSignal.txt"));
    }
  }
