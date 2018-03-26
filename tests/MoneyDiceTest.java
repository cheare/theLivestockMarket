import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyDiceTest {

    @Test
    void isBlueInRange(){
        MoneyDice blueDice = new MoneyDice(MoneyDice.TypeMoney.BLUE);
        blueDice.throwDice();
        int value = blueDice.getValue();
        assertTrue(value>=0 && value <=5);
    }

    @Test
    void isRedInRange(){
        MoneyDice redDice = new MoneyDice(MoneyDice.TypeMoney.RED);
        redDice.throwDice();
        int value = redDice.getValue();
        assertTrue(value>=0 && value <=10);
    }

    @Test
    void isGreenInRange(){
        MoneyDice greenDice = new MoneyDice(MoneyDice.TypeMoney.GREEN);
        greenDice.throwDice();
        int value = greenDice.getValue();
        assertTrue(value>=0 && value <=15);
    }


}