import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String>createRandomArray(int size) {
    ArrayList<String> arrayList = new ArrayList<String>(size);
    for (int i = 0; i < size; i++) {
      int rand = (int)(11 * Math.random());
      String randString = "";
      if (rand != 0) {
        randString = "" + rand;
      }
      arrayList.add(randString);
    }
    return arrayList;
  }

  public static void replaceEmpty(ArrayList<String> original) {
    for (int i = 0; i < original.size(); i++) {
      if (original.get(i).equals("")) {
        original.set(i,"Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList(ArrayList<String> original) {
    ArrayList<String> newList = new ArrayList<String>(original.size());
    for (int i = original.size() - 1; i >= 0; i--) {
      newList.add(original.get(i));
    }
    return newList;
  }

  public static void main(String[] args) {
    //System.out.println(createRandomArray(200000));

    ArrayList<String> test1 = createRandomArray(200000);
    replaceEmpty(test1);
    System.out.println(test1);

    test1 = createRandomArray(10);
    System.out.println(test1);
    System.out.println(makeReversedList(test1));
  }
}
