package lotr;
import java.util.Random;

public class King extends Character {
    private static Random random = new Random();

    public King() {
        super(random.nextInt(11)+5, random.nextInt(11)+5);
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - random.nextInt(getPower()+1));
        System.out.println("Health of "+ c.getClass().getSimpleName() + " was decreased because " + getClass().getSimpleName() + " kicked him." );
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + super.toString();
    }
}

