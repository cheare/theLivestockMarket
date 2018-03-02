public class DiceMoney extends Dice{

    private int multiplier;

    public int getValue() {
        return value;
    }

    public enum TypeMoney {
        BLUE, RED, GREEN;
    }

    DiceMoney(TypeMoney type){
        switch (type){
            case BLUE:
                this.multiplier = 1;
                break;
            case RED:
                this.multiplier = 2;
                break;
            case GREEN:
                this.multiplier = 3;
                break;
        }
    }

    @Override
    public void throwDice() {
        while (super.value == 0) {
            super.throwDice();
        }
        this.value *= multiplier;
    }
}
