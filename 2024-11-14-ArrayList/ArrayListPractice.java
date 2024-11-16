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

  public static ArrayList<String> mixLists(ArrayList<String> a, ArrayList<String> b) {
    ArrayList<String> mixedList = new ArrayList<String>(a.size() + b.size());
    int i = 0;
    while (i < a.size() && i < b.size()) {
      mixedList.add(a.get(i));
      mixedList.add(b.get(i));
      i++;
    }
    while (i < a.size()) {
      mixedList.add(a.get(i));
      i++;
    }
    while (i < b.size()) {
      mixedList.add(b.get(i));
      i++;
    }
    return mixedList;
  }

  public static void main(String[] args) {
    //System.out.println(createRandomArray(200000));

    ArrayList<String> test1 = createRandomArray(20);
    replaceEmpty(test1);
    System.out.println(test1);

    test1 = createRandomArray(10);
    System.out.println(test1);
    System.out.println(makeReversedList(test1));

    ArrayList<String> list1 = new ArrayList<>();
    list1.add("1");
    list1.add("3");
    list1.add("5");
    ArrayList<String> list2 = new ArrayList<>();
    list2.add("2");
    list2.add("4");
    list2.add("6");
    list2.add("8");
    list2.add("10");
    ArrayList<String> test2 = mixLists(list1, list2);
    System.out.println(test2);
  }
}
