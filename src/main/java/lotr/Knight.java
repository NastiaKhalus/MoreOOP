package lotr;
import java.util.Random;

public class Knight extends Character {
    private static Random random = new Random();

    public Knight() {
        super(random.nextInt(2, 13), random.nextInt(2, 13));
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - random.nextInt(0,getPower()+1));
        System.out.println("Health of "+ c.getClass().getSimpleName() + " was decreased because " + getClass().getSimpleName() + " kicked him." );
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + super.toString();
    }
}
