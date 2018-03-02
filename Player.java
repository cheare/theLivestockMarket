public class Player {
    private String name;
    private ScoringBoard scoringBoard;
    private DiceMoney blue1 = new DiceMoney(DiceMoney.TypeMoney.BLUE);;
    private DiceMoney blue2 = new DiceMoney(DiceMoney.TypeMoney.BLUE);;
    private DiceMoney red = new DiceMoney(DiceMoney.TypeMoney.RED);;
    private DiceMoney green = new DiceMoney(DiceMoney.TypeMoney.GREEN);;

    public Player(String name) {
        this.name = name;
        throwAllDices();
    }

    private void throwAllDices(){
        blue1.throwDice();
        blue2.throwDice();
        red.throwDice();
        green.throwDice();
    }


    public ScoringBoard getScoringBoard() {
        return scoringBoard;
    }


}
