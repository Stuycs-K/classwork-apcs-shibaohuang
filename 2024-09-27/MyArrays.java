public class MyArrays{
  public static String arrayToString(int[] nums){
    String ans = "[";
    for (int i = 0; i < nums.length; i++){
      ans = ans + nums[i];
      if (i < nums.length - 1){
        ans = ans + ", ";
      }
    }
    return ans + "]";
  }

  public static int[] returnCopy(int[]ary){
    int[] copy = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      copy[i] = ary[i];
    }
    return copy;
  }

  public static int[] concatArray(int[] ary1, int[] ary2){
    int[] concatenated = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++){
      concatenated[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++){
      concatenated[ary1.length + i] = ary2[i];
    }
    return concatenated;
  }

  public static void main(String[] args){
    int[] array = {1, 2, 3, 4};
    int[] copy = returnCopy(array);
    System.out.println("Arrays match and are different arrays: " + (arrayToString(array).equals(arrayToString(copy)) && (array != copy)));
  
    array = new int[] {5, 5, 5, 5};
    copy = returnCopy(array);
    System.out.println("Arrays match and are different arrays: " + (arrayToString(array).equals(arrayToString(copy)) && (array != copy)));
  
    array = new int[] {};
    copy = returnCopy(array);
    System.out.println("Arrays match and are different arrays: " + (arrayToString(array).equals(arrayToString(copy)) && (array != copy)));
  
    int[] array1 = {1, 2, 3};
    int[] array2 = {4, 5, 6};
    int[] concatenated = concatArray(array1, array2);
    System.out.println("Concatenated array matches expected result: " + arrayToString(concatenated).equals("[1, 2, 3, 4, 5, 6]"));

    array1 = new int[] {4, 5, 6};
    array2 = new int[] {4, 5, 6};
    concatenated = concatArray(array1, array2);
    System.out.println("Concatenated array matches expected result: " + arrayToString(concatenated).equals("[4, 5, 6, 4, 5, 6]"));

    array1 = new int[] {};
    array2 = new int[] {};
    concatenated = concatArray(array1, array2);
    System.out.println("Concatenated array matches expected result: " + arrayToString(concatenated).equals("[]"));

    array1 = new int[] {6, 5};
    array2 = new int[] {};
    concatenated = concatArray(array1, array2);
    System.out.println("Concatenated array matches expected result: " + arrayToString(concatenated).equals("[6, 5]"));

    array1 = new int[] {};
    array2 = new int[] {6, 5};
    concatenated = concatArray(array1, array2);
    System.out.println("Concatenated array matches expected result: " + arrayToString(concatenated).equals("[6, 5]"));
  }
}
