package lotr;
public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        Character character1 = factory.createCharacter();
        Character character2 = factory.createCharacter();

        GameManager manager = new GameManager();
        manager.fight(character1,character2);

        System.out.println(character1);
        System.out.println(character2);
    }
}
