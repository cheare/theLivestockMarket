import java.util.LinkedList;

public class Bank {
    private MoneyDice blue= new MoneyDice(MoneyDice.TypeMoney.BLUE);;
    private MoneyDice red = new MoneyDice(MoneyDice.TypeMoney.RED);;
    private MoneyDice green = new MoneyDice(MoneyDice.TypeMoney.GREEN);;
    private boolean isExchangePossible;

    Bank(){
        throwAllDices();
    }

    private void throwAllDices(){
        blue.throwDice();
        red.throwDice();
        green.throwDice();
        this.isExchangePossible = true;
    }

    public int exchangeDice(MoneyDice diceToExchange){
        MoneyDice.TypeMoney type = diceToExchange.getType();
        int valueToReturn = 0;
        switch (type) {
            case BLUE:
                valueToReturn = blue.getValue();
                blue.throwDice();
                break;
            case RED:
                valueToReturn = red.getValue();
                red.throwDice();
                break;
            case GREEN:
                valueToReturn = green.getValue();
                green.throwDice();
                break;
        }
        this.isExchangePossible = false;
        return valueToReturn;
    }

    public LinkedList<MoneyDice> getBank(){
        LinkedList<MoneyDice> bank = new LinkedList<>();
        bank.add(blue);
        bank.add(green);
        bank.add(red);
        return bank;
    }

    @Override
    public String toString(){
        String output = "Bank:\n";
        for (MoneyDice moneyDice : getBank()){
            output += moneyDice.getType() + ": " + moneyDice.getValue() +"\n";
        }
        return output;
    }

    public void makeExchangePossible(){
        this.isExchangePossible = true;
    }

    public MoneyDice getBlue() {
        return blue;
    }

    public MoneyDice getRed() {
        return red;
    }

    public MoneyDice getGreen() {
        return green;
    }

    public boolean isExchangePossible() {
        return isExchangePossible;
    }
}