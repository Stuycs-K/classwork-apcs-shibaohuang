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
  }
}
