package lotr;
import java.util.Random;

public class King extends Character {
    private Fight kickbehavior;
    private static Random random = new Random();

    public King() {
        super(random.nextInt(11)+5, random.nextInt(11)+5);
        this.kickbehavior = new Fight();
    }

    public void kick(Character c) {
        kickbehavior.kick(this, c); 
    }

}

