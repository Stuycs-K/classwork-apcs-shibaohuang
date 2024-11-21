import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Part1 {
  public static String decipherMessage(String filename) {
    int sum = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNextLine()) {
        String line = input.nextLine();
        int lastDashIndex = line.lastIndexOf('-');
        int openBracketIndex = line.indexOf('[');
        String encryptedName = line.substring(0, lastDashIndex);
        int sectorID = Integer.parseInt(line.substring(lastDashIndex + 1, openBracketIndex));
        String checksum = line.substring(openBracketIndex + 1, line.length() - 1);
        int[] frequency = new int[26];
        for (int i = 0; i < encryptedName.length(); i++) {
          char c = encryptedName.charAt(i);
          if (c != '-') {
            frequency[c - 'a']++;
          }
        }
        String calculatedChecksum = "";
        boolean[] used = new boolean[26];
        for (int i = 0; i < 5; i++) { 
          int maxFreq = -1;
          char maxChar = ' ';
          for (int j = 0; j < 26; j++) {
            if (!used[j] && frequency[j] > maxFreq) {
              maxFreq = frequency[j];
              maxChar = (char) (j + 'a');
            }
            else if (!used[j] && frequency[j] == maxFreq) {
              if (maxChar == ' ' || j + 'a' < maxChar) {
                maxChar = (char) (j + 'a');
              }
            }
          }
          used[maxChar - 'a'] = true;
          calculatedChecksum += maxChar;
        }
        if (calculatedChecksum.equals(checksum)) {
          sum += sectorID;
        }
      }
      input.close();
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return String.valueOf(sum);
  }
  
  public static void main(String[] args) {
    System.out.println(decipherMessage("inputIDs.txt"));
  }
}
