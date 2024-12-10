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
      String input = userInput.nextLine();
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      if (input.equals("attack") || input.equals("a")) {
        System.out.println(player.attack(enemy));
      }
      else if (input.equals("special") || input.equals("sp")) {
        System.out.println(player.specialAttack(enemy));
      }
      else if (input.equals("support") || input.equals("su")) {
        System.out.println(player.support());
      }
      else if (input.equals("quit")) {
        System.out.println("You have quit the game.");
        break;
      }
      else {
        System.out.println("Please give a valid response.");
      }

    if (enemy.getHP() <= 0) {
      System.out.println("You won! " + player.getName() + " defeated " + enemy.getName() + ".");
      break;
    }

    int enemyAction = random.nextInt(3);
    if (enemyAction == 0) {
      System.out.println(enemy.attack(player));
    }
    else if (enemyAction == 1) {
      System.out.println(enemy.specialAttack(player));
    } 
    else if (enemyAction == 2) {
      System.out.println(enemy.support());
    }

    if (player.getHP() <= 0) {
      System.out.println("Game over! " + enemy.getName() + " defeated " + player.getName() + ".");
      break;
    }
  }
  userInput.close();
  }
}
