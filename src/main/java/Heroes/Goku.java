package heroes;

public class Goku extends Hero {
    @Override
    public void firePrimary() {
        mana -= 5;

    }


    @Override
    public void fireSecondary() {
        mana -= 40;

    }

    @Override
    public void receiveHit() {
        hp -= 1;
        mana += 3;

    }

    public Goku(String name, int hp, int mana) {
        super(name, hp, mana);
    }
}
