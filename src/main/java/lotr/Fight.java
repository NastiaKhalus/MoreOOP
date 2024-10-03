package lotr;
import java.util.Random;

public class Fight {
    private static Random random = new Random();

    public void kick(Character attacker, Character defender) {
        int damage = random.nextInt(attacker.getPower() + 1);
        defender.setHp(defender.getHp() - damage);
        System.out.println("Health of " + defender.getClass().getSimpleName() + " was decreased by " + damage + " because " + attacker.getClass().getSimpleName() + " kicked him.");
    }
}
