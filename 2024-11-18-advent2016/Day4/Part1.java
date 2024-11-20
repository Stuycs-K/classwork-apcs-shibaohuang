import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part1 {
  public static String bathroomCode(String filename) {
    String sum = "";
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      input.close();
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return sum;
    }

    public static void main(String[] args) {
      System.out.println(decipherMessage("inputIDs.txt"));
    }
  }
