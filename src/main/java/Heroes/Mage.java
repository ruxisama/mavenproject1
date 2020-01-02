package heroes;

public class Mage extends Hero {
    @Override
    public void firePrimary() {
        mana -=15;

    }

    @Override
    public void fireSecondary() {
        mana -=40;

    }

    @Override
    public void receiveHit() {
        hp -=30;

    }

    public Mage(String name, int hp, int mana) {
        super(name, hp, mana);
    }
}
