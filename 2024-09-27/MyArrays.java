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
  
  public static void main(String[args]){
    
  }
}
