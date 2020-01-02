package heroes;

public class Superman extends Hero {
    @Override
    public void firePrimary() {
        mana -= 10;
        hp++;

    }

    @Override
    public void fireSecondary() {
        mana -= 30;
        hp += 3;

    }

    @Override
    public void receiveHit() {
        hp--;

    }

    public Superman(String name, int hp, int mana) {
        super(name, hp, mana);
    }
}
