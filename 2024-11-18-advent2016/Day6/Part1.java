import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part1 {
  public static String decipherMessage(String filename) {
    String message = "";
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String[] lines = new String[1000];
      int rowCount = 0;
      while (input.hasNextLine()) {
        String line = input.nextLine();
        if (!line.isEmpty()) {
          lines[rowCount] = line;
          rowCount++;
        }
      }
            
    public static void main(String[] args) {
        System.out.println(decipherMessage("inputSignal.txt"));
    }
}
