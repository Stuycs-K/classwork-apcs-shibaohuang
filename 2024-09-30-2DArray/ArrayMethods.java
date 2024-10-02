public class ArrayMethods {
  // Hugo Hu, hhu60@stuy.edu, Skylar Huang, shuang60@stuy.edu
  public static String arrToString(int[] nums) {
    String s = "[";

    if (nums.length >= 1) {
      s += nums[0];
    }

    if (nums.length > 1) {
      for (int i = 1; i < nums.length; i++) {
        s += ", " + nums[i];
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

  public static int arr2DSum(int[][] ary) {
    int out = 0;
    for (int i = 0; i < ary.length; i++) {
      for (int j = 0; j < ary[i].length; j++) {
        out += ary[i][j];
      }
    }
    return out;
  }

  public static int[][] swapRC(int[][]nums){
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

  public static void main (String[] args) {
    // test arrayToString int[]
    System.out.println(arrToString(new int[] {2, 3, 4, 9}));


    // test arrToString int[][]
    System.out.println(arrToString(new int[][] {
      {2, 3, 4},
      {5, 6, 7},
      {2, 4, 0}
    }));

    System.out.println(arrToString(new int[][] {
      {2, 3, 4},
      {5, 6, 7},
      {2, 4, 0},
      {3, 4, 7}
    }));
    
    System.out.println(arrToString(new int[][] {
      {},
      {5, 6, 7, -5, 5},
      {2, 4, 0}
    }));

    System.out.println(arrToString(new int[][] {
      {},
      {},
      {}
    }));

    // test arr2DSum int[][]
    System.out.println(arr2DSum(new int[][] {
      {2, 3, 4},
      {5, 6, 7},
      {2, 4, 0}
    }));

    System.out.println(arr2DSum(new int[][] {
      {},
      {5, 6, 7, -5, 5},
      {2, 4, 0}
    }));

    System.out.println(arr2DSum(new int[][] {
      {2, 3, 4},
      {5, 6, 7},
      {2, 4, 0},
      {3, 4, 7}
    }));

    System.out.println(arr2DSum(new int[][] {
      {},
      {},
      {}
    }));

    // test swapRC int[][]
    System.out.println(arrToString(swapRC(new int[][] {
      {2, 3, 4},
      {5, 6, 7},
      {2, 4, 0}
    })));

    System.out.println(arrToString(swapRC(new int[][] {
      {2, 3, 4},
      {5, 6, 7},
      {2, 4, 0},
      {3, 4, 7}
    })));

    // test replaceNegative int[][]
    int[][] testArray2D = new int[][] {
      {2, 3, -4},
      {-5, -9, -7},
      {2, 4, 0}
    };

    replaceNegative(testArray2D);

    System.out.println(arrToString(testArray2D));

    testArray2D = new int[][] {
      {0, 3, -4},
      {8, -9, -9, -7},
      {}
    };

    replaceNegative(testArray2D);

    System.out.println(arrToString(testArray2D));
  }
}