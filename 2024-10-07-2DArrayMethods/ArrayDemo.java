import java.util.Arrays;
public class ArrayDemo {

  public static void main(String[]args){
    int[] notEmptyArray = {1, 2, 3, 4, 5};
    System.out.println("1D Array Test");
    System.out.println("arrToString: " + arrToString(notEmptyArray));
    System.out.println("Arrays.toString: " + Arrays.toString(notEmptyArray));
    System.out.println();
        
    int[] emptyArray = {};
    System.out.println("Empty 1D Array Test");
    System.out.println("arrToString: " + arrToString(emptyArray));
    System.out.println("Arrays.toString: " + Arrays.toString(emptyArray));
    System.out.println();
        
    int[][] notEmpty2DArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("2D Array Test");
    System.out.println("arrToString: " + arrToString(notEmpty2DArray));
    System.out.println("Arrays.deepToString: " + Arrays.deepToString(notEmpty2DArray));
    System.out.println();
        
    int[][] empty2DArray = {};
    System.out.println("Empty 2D Array Test");
    System.out.println("arrToString: " + arrToString(empty2DArray));
    System.out.println("Arrays.deepToString: " + Arrays.deepToString(empty2DArray));
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
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] == 0) {
          count++;
        }
      }
    }
    return count;
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

  public static int[] copy1D(int[] arr) {
    int[] copy = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        copy[i] = arr[i];
    }
    return copy;
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
    String html = "<table>";
    for (int i = 0; i < nums.length; i++) {
      html += "<tr>";
      for (int j = 0; j < nums[i].length; j++) {
        html += "<td>" + nums[i][j] + "</td>";
        }
        html += "</tr>";
    }
    html += "</table>";
    return html;
  }

}