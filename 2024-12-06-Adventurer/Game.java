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
      if (userName.equals("attack") || userName.equals("a")) {
        System.out.printl(player.attack(enemy));
      }
      else if (userName.equals("special") || userName.equals("sp")) {
        System.out.printl(player.specialAttack(enemy));
      }
      else if (userName.equals("support") || userName.equals("su")) {
        System.out.printl(player.support());
      }
      else if (userName.equals("quit")) {
        System.out.println("You have quit the game.");
        break;
      }
      else {
        System.out.println("Please give a valid response.")
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
