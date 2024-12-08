public class Driver {
    public static void main(String[] args) {
        Adventurer p1 = new Fairy("Luna", 50);
        Adventurer p2 = new Fairy("Flora", 60);

        //initial stats
        System.out.println(p1.getName() + " HP: " + p1.getHP() + "/" + p1.getmaxHP());
        System.out.println(p2.getName() + " HP: " + p2.getHP() + "/" + p2.getmaxHP());

        //test attack method
        System.out.println(p1.attack(p2));
        System.out.println("After attack, " + p2.getName() + " HP: " + p2.getHP());

        //test support method
        System.out.println(p1.support(p2));
        System.out.println(p2.getName() + " HP: " + p2.getHP());

        // test healing support method for p1
        System.out.println(p1.support());
        System.out.println(p1.getName() + " HP: " + p1.getHP());

        // test special attack
        System.out.println(p1.specialAttack(p2));
        System.out.println("After special attack, " + p2.getName() + " HP: " + p2.getHP());

        // test special attack when Sprinkle low
        System.out.println(p1.specialAttack(p2));  // Not enough Sprinkle
    }
}
