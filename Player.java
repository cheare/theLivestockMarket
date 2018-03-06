import java.util.LinkedList;

public class Player {
    private String name;
    private ScoringBoard scoringBoard;
    private MoneyDice blue1 = new MoneyDice(MoneyDice.TypeMoney.BLUE);;
    private MoneyDice blue2 = new MoneyDice(MoneyDice.TypeMoney.BLUE);;
    private MoneyDice red = new MoneyDice(MoneyDice.TypeMoney.RED);;
    private MoneyDice green = new MoneyDice(MoneyDice.TypeMoney.GREEN);;

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

    public LinkedList<MoneyDice> getMoneyDices(){
        LinkedList<MoneyDice> moneyDices = new LinkedList<>();
        moneyDices.add(getBlue1());
        moneyDices.add(getBlue2());
        moneyDices.add(getRed());
        moneyDices.add(getGreen());
        return moneyDices;
    }

    public int getSumOfMoneyDices(LinkedList<MoneyDice> moneyDices){
        int sum = 0;
        for (MoneyDice e : moneyDices){
            sum += e.getValue();
        }
        return sum;
    }

    public String printMoneyDices(LinkedList<MoneyDice> moneyDices){
        String output = "Twoje kostki to:\n\n";
        for (MoneyDice e : moneyDices){
            output += e.getType() + ": " + e.getValue() + "\n";
        }
        return output;
    }


    public ScoringBoard getScoringBoard() {
        return scoringBoard;
    }

    public String getName() {
        return name;
    }

    public MoneyDice getBlue1() {
        return blue1;
    }

    public MoneyDice getBlue2() {
        return blue2;
    }

    public MoneyDice getRed() {
        return red;
    }

    public MoneyDice getGreen() {
        return green;
    }

    public void setBlue1(MoneyDice blue1) {
        this.blue1 = blue1;
    }

    public void setBlue2(MoneyDice blue2) {
        this.blue2 = blue2;
    }

    public void setRed(MoneyDice red) {
        this.red = red;
    }

    public void setGreen(MoneyDice green) {
        this.green = green;
    }
}
