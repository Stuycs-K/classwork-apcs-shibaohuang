import java.util.Scanner;
import java.util.Random;

public class Game {
  private static void printStatus(Adventurer player, Adventurer enemy) {
    System.out.println(player.getName() + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
    System.out.println(enemy.getName() + ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
  }

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = userInput.nextLine();
    System.out.println("Username is: " + userName);
    Random random = new Random();

    Adventurer player = new CodeWarrior(userName, 30, "Java");
    Adventurer enemy = new Fairy("Flora", 50);

    while (player.getHP() > 0 && enemy.getHP() > 0) {
      printStatus(player, enemy);
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");

      
    if (userInput.equals("attack") || userInput.equals("a")) {
      attack(userName);
    }
    if (userInput.equals("special") || userInput.equals("sp")) {
      specialAttack(userName);
    }
    if (userInput.equals("support") || userInput.equals("su")) {
      support(userName);
    }
    if (userInput.equals("quit")) {
      System.out.println("You have quit the program");

    }
    else {
      System.out.println("Please give a valid response.");
    }
  }
  }
}
