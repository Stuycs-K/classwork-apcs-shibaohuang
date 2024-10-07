import java.util.Arrays;
public class ArrayDemo {

  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
  }

  public static String arrToString(int[] ary) {
    String s = "[";
    if (ary.length >= 1) {
      s += ary[0];
    }
    if (ary.length > 1) {
      for (int i = 1; i < ary.length; i++) {
        s += ", " + ary[i];
      }
    }
    s += "]";
    return s;
  }

  public static String arrToString(int[][]ary){
      String s = "[";
      if (ary.length >= 1){
        s += arrToString(ary[0]);
      }
      if (ary.length > 1){
        for (int i = 1; i < ary.length; i++){
          s += ", " + arrToString(ary[i]);
        }
      }
      return s + "]";
  }

  public static int countZeros2D(int[][] nums){
    return 0;
  }

  public static int arr2DSum(int[][] nums) {
    int out = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        out += nums[i][j];
      }
    }
    return out;
  }

  public static void replaceNegative(int[][] vals) {
    for (int i = 0; i < vals.length; i++) {
      for (int j = 0; j < vals[i].length; j++) {
        if (vals[i][j] < 0) {
          if (i == j) {
            vals[i][j] = 1;
          } else {
            vals[i][j] = 0;
          }
        }
      }
    }
  }

  public static int[][] copy(int[][] nums) {
    int[][] copyArray = new int[nums.length][];
    for (int i = 0; i < nums.length; i++) {
        copyArray[i] = copy1D(nums[i]);
    }
    return copyArray;
  }

  public static int[][] swapRC(int[][]nums) {
    if (nums.length == 0) {
        return new int[0][0];
    }
    int rows = nums.length;
    int columns = nums[0].length;
    int[][] swapped = new int[columns][rows];
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            swapped[j][i] = nums[i][j];
        }
    }
    return swapped;
  }

  public static String htmlTable(int[][]nums){
    return "";
  }



}
