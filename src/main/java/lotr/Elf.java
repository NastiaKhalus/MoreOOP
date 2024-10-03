package lotr;
public class Elf extends Character {

    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if(getPower()< c.getPower()){
            setPower(getPower()-1);
            System.out.println(getClass().getSimpleName()+ " lost 1 point of his power because "+ c.getClass().getSimpleName()+" kicked him.");
        } else if (getPower()> c.getPower()) {
            c.setHp(0);
            System.out.println(c.getClass().getSimpleName()+ " died because "+ getClass().getSimpleName()+" kicked him.");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + super.toString();
    }
}
