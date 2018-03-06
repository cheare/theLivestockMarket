public class MoneyDice extends Dice{

    private int multiplier;
    private TypeMoney type;

    public int getValue() {
        return value;
    }

    public TypeMoney getType() {return type; }

    public enum TypeMoney {
        BLUE, RED, GREEN;
    }

    MoneyDice(TypeMoney type){
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
        this.type = type;
    }

    @Override
    public void throwDice() {
        while (super.value == 0) {
            super.throwDice();
        }
        this.value *= multiplier;
    }
}
