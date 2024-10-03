
import lotr.Hobbit;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import lotr.Character;



import static org.junit.jupiter.api.Assertions.assertEquals;


public class HobbitTest {
    private Hobbit character;

    @BeforeEach
    public void init() {
        character = new Hobbit();
    }

    @Test
    public void testToString() {
        assertEquals("Hobbit{hp=3, power=0}", character.toString());
    }

    @Test
    public void testIsClass() {
        // assertTrue(character instanceof lotr.Character);
        assertTrue(character instanceof Character);
    }

    @Test
    public void testSetHp() {
        character.setHp(-100);
        assertEquals(0, character.getHp());
    }
}