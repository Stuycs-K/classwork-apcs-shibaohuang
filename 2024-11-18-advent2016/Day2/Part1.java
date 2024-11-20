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
    char[][] keypadChars = {
      {' ', '1', ' ', ' ', ' '},
      {' ', '2', '3', '4', ' '},
      {'5', '6', '7', '8', '9'},
      {' ', 'A', 'B', 'C', ' '},
      {' ', ' ', 'D', ' ', ' '}
    };
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNextLine()) {
        String line = input.nextLine();
        for (int i = 0; i < line.length(); i++) {
          char move = line.charAt(i);
          if (move == 'U' && x > 0 && keypad[x - 1][y] == 1) x--;
          if (move == 'D' && x < 4 && keypad[x + 1][y] == 1) x++;
          if (move == 'L' && y > 0 && keypad[x][y - 1] == 1) y--;
          if (move == 'R' && y < 4 && keypad[x][y + 1] == 1) y++;
        }
        code += keypadChars[x][y];
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