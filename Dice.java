import java.util.Random;

public class Dice {

    protected int value;

    public void throwDice(){
        Random random = new Random();
        int face = random.nextInt(6);
        this.value = face;
    }
}
