package lotr;
public class GameManager {
    public void fight(Character c1, Character c2){
        int round = 0;
        System.out.println(c1.getClass() + " fights with " + c2.getClass());
        while (round<10) {
            c1.kick(c2);
            if (!c2.isAlive()){
                System.out.println(c2.getClass() + " is dead.");
                break;
            }

            c2.kick(c1);
            if (!c1.isAlive()){
                System.out.println(c1.getClass() + " is dead.");
                break;
            }

            round+=1;
        }
        if(round==10){
            System.out.println("It is a draw");
        }

    }
}

