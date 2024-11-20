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
      if (rowCount == 0) {
        return message;
      }
      int length = lines[0].length();
      for (int col = 0; col < length; col++) {
        int[] counts = new int[26];
        for (int row = 0; row < rowCount; row++) {
          char ch = lines[row].charAt(col);
          counts[ch - 'a']++;
        }
                

            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }

        return message;
    }

            
    public static void main(String[] args) {
        System.out.println(decipherMessage("inputSignal.txt"));
    }
}
