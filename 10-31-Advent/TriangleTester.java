import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
    public static int countTrianglesA(String filename) {
        int count = 0;
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNextInt()) {
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();
                if (isValidTriangle(a, b, c)) {
                    count++;
                }
            }
            input.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
            }
            return count;
    }

    public static int countTrianglesB(String filename) {
        int count = 0;
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNextInt()) {
                int[][] rows = new int[3][3];
                for (int row = 0; row < 3; row++) {
                    for (int col = 0; col < 3; col++) {
                        rows[row][col] = input.nextInt();
                    }
                }
                for (int col = 0; col < 3; col++) {
                    int a = rows[0][col];
                    int b = rows[1][col];
                    int c = rows[2][col];
                    if (isValidTriangle(a, b, c)) {
                        count++;
                    }
                }
            }
            input.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return count;
    }

    public static int countTrianglesC(String filename) {
        int count = 0;
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] nums = line.split("x");
                int a = Integer.parseInt(nums[0]);
                int b = Integer.parseInt(nums[1]);
                int c = Integer.parseInt(nums[2]);
                if (isValidTriangle(a, b, c)) {
                    count++;
                }
            }
            input.close();
        } 
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return count;
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        int validTrianglesCount = countTrianglesB("inputTri.txt");
        System.out.println(validTrianglesCount);
    }
}
