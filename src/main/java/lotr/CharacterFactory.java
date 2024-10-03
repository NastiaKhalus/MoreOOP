package lotr;
import java.util.Random;

public class CharacterFactory  {
    private static Random random = new Random();

    public Character createCharacter(){
        int num = random.nextInt(4);
        if (num == 0){
            return new Hobbit();
        }
        else if (num == 1){
            return new Elf();
        }
        else if (num == 2){
            return new King();
        }
        else {
            return new Knight();
        }
    }
}

