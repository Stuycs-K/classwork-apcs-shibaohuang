import java.util.Arrays;
import java.util.Random;

public class Driver {
  public static int[] randomArray() {
    Random rand = new Random();
    int[] array = new int[3];
    for (int i = 0; i < 3; i++) {
      array[i] = rand.nextInt(100);
    }
    return array;
  }
}
