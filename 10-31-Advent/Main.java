import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String text = "This is a sample\nOf how to read\ntext!";
        
        // creates a Scanner object to read through the String
        Scanner input = new Scanner(text);
        
        while(input.hasNext()){
            System.out.println(input.next());
        }
        
        Scanner sc1 = new Scanner("This is a bunch of words");
        System.out.println("\nPrinting out each word one per line");
        while (sc1.hasNext()) {
        System.out.println(sc1.next());
        }
        
        Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
        double sum = 0;
        System.out.println("\nCalculating the sum of values using nextDouble()");
        while (sc2.hasNextDouble()) {
            sum += sc2.nextDouble();
        }
        System.out.println("Sum of doubles: " + sum);
    }
}
