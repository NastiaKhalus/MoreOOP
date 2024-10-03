package lotr;
import java.util.Random;

public class Knight extends Character {
    private static Random random = new Random();
    private Fight kickbehavior;

    public Knight() {
        super(random.nextInt( 11)+2, random.nextInt(11)+2);
        this.kickbehavior = new Fight();
    }

    public void kick(Character c) {
        kickbehavior.kick(this, c);
    }

}
