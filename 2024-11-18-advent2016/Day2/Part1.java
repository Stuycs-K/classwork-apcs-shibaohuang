import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part1 {
  public static String bathroomCode(String filename) {
    String code = "";
    int[][] keypad = {
      {0, 1, 0, 0, 0},
      {0, 0, 1, 1, 0},
      {1, 1, 1, 1, 1},
      {0, 1, 1, 1, 0},
      {0, 0, 1, 0, 0}
    };
    int x = 2;
    int y = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNextLine()) {
        String line = input.nextLine();
        for (char move : line.toCharArray()) {
          if (move == 'U' && x > 0) x--;
          if (move == 'D' && x < 2) x++;
          if (move == 'L' && y > 0) y--;
          if (move == 'R' && y < 2) y++;
        }
        code += keypad[x][y];
      }
      input.close();
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return code;
  }
    public static void main(String[] args) {
      System.out.println(bathroomCode("inputCode.txt"));
    }
  }