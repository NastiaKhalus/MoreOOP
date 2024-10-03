package lotr;
public abstract class Character {
    private int power;
    private int hp;

    public Character(int power,int hp){
        this.power = power;
        this.hp = hp;
    }

    public abstract void kick(Character c);

    public boolean isAlive() {
        if(getHp()==0){
            return false;
        }
        return true;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        }
        else {
            this.hp = hp;
        }
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
