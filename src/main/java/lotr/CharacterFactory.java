package lotr;
import java.util.Random;

public class CharacterFactory  {
    private static Random random = new Random();

    public Character createCharacter(){
        int num = random.nextInt(1,5);
        if (num == 1){
            return new Hobbit();
            
        }
        else if (num == 2){
            return new Elf();
        }
        else if (num == 3){
            return new King();
        }
        else {
            return new Knight();
        }
    }
}

/*
class CharacterFactory
   - methods: Character createCharacter() {
                returns random instance of any existing character
              }
 */
