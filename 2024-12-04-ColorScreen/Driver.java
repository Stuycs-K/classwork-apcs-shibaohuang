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

  public static void displayNumbers(int[] numbers) {
    Text.go(2, 1);
    int spacing = 80 / 4;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < 25) {
        Text.color(Text.RED, Text.BRIGHT);
      }
      else if (numbers[i] > 75) {
        Text.color(Text.GREEN, Text.BRIGHT);
      }
      else {
        Text.color(Text.WHITE);
      }
      System.out.print(numbers[i]);
      if (i < numbers.length - 1) {
        Text.go(2, (i + 1) * spacing + 1);
      }
    }
  }

  public static void separator() {
    Text.go(3, 1);
    Text.color(Text.RED, Text.BRIGHT);
    for (int i = 0; i < 80; i++) {
      System.out.print("-");
    }
  }

  public static void star() {
    Text.go(15, 40);
    Text.color(Text.YELLOW, Text.BRIGHT);
    System.out.print("*");
  }

  public static void main(String[] args) {
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);

    border();

    int[] array = randomArray();
    displayNumbers(array);

    separator();

    star();

    Text.go(31, 0);

    System.out.print(Text.RESET);
  }
}
