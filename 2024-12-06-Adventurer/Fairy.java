public class Fairy extends Adventurer {
    private int sprinkle;

    public Fairy(String name, int hp) {
        super(name, hp);
        this.sprinkle = 50;
    }

    @Override
    public String getSpecialName() {
        return "Sprinkle";
    }

    @Override
    public int getSpecial() {
        return this.sprinkle;
    }

    @Override
    public void setSpecial(int n) {
        this.sprinkle = n;
    }

    @Override
    public int getSpecialMax() {
        return 100;
    }

    @Override
    public String attack(Adventurer other) {
        other.applyDamage(5);
        return this.getName() + " sprinkles magic dust on " + other.getName() + " for 5 damage.";
    }

    @Override
    public String support(Adventurer other) {
        other.setHP(other.getHP() + 15);
        if (other.getHP() > other.getmaxHP()) {
            other.setHP(other.getmaxHP());
        }
        return this.getName() + " sprinkles healing dust on " + other.getName() + " for 15 HP.";
    }

    @Override
    public String support() {
        this.setHP(this.getHP() + 10);
        if (this.getHP() > this.getmaxHP()) {
            this.setHP(this.getmaxHP());
        }
        return this.getName() + " sprinkles healing dust on herself for 10 HP.";
    }

    @Override
    public String specialAttack(Adventurer other) {
        if (this.sprinkle >= 30) {
            this.sprinkle -= 30;
            other.applyDamage(40);
            return this.getName() + " uses her Sprinkle to cast a powerful spell on " + other.getName() + " for 40 damage!";
        } else {
            return this.getName() + " doesn't have enough Sprinkle for a special attack!";
        }
    }
}
