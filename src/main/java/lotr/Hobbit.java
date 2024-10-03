package lotr;
public class Hobbit extends Character {

    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character c) {
        toCry();
        
    }

    private void toCry() {
        System.out.println("Hobbit is crying :(.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + super.toString();
    }
}

/*
class Hobbit
  - attributes: int power=0, int hp=3
  - methods: void kick(Character c) { toCry() }
 */
