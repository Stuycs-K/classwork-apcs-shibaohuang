public class Game {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = userInput.nextLine();
    System.out.println("Username is: " + userName);

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
