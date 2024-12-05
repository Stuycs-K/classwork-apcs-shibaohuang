import java.util.Arrays;
import java.util.Random;

public class Driver {
  public static int[] randomArray() {
    int[] array = new int[3];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 100);
    }
    return array;
  }

  public static void border() {
    for (int i = 0; i < 80; i++) {
      Text.go(1, i + 1);
      Text.color(Text.RED, Text.BRIGHT);
      System.out.print("$");
    }
    for (int i = 0; i < 80; i++) {
      Text.go(30, i + 1);
      Text.color(Text.RED, Text.BRIGHT);
      System.out.print("$");
    }
    for (int i = 1; i < 30; i++) {
      Text.go(i + 1, 1);
      Text.color(Text.RED, Text.BRIGHT);
      System.out.print("$");
      Text.go(i + 1, 80);
      Text.color(Text.RED, Text.BRIGHT);
      System.out.print("$");
    }
  }

  public static void main(String[] args) {
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);
    border();
  }
}
