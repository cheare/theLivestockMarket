import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    @Test
    void throwDice() {
        Dice dice = new Dice();
        dice.throwDice();
        int result = dice.value;
        assertTrue(result>=0 && result<=5);
    }

}