public class Bank {
    private DiceMoney blue= new DiceMoney(DiceMoney.TypeMoney.BLUE);;
    private DiceMoney red = new DiceMoney(DiceMoney.TypeMoney.RED);;
    private DiceMoney green = new DiceMoney(DiceMoney.TypeMoney.GREEN);;
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

    public int exchangeDice(DiceMoney.TypeMoney type){
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

    public void makeExchangePossible(){
        this.isExchangePossible = true;
    }


}