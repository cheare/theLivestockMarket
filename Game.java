import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    private LinkedList<Player> players = new LinkedList<>();
    private FarmerBoard farmerBoard;
    private Bank bank;
    private Market market;
    public Player activePlayer;
    private Scanner sc = new Scanner(System.in);

    public Game(){
        addPlayers();
        this.activePlayer = whoStarts();
        this.farmerBoard = new FarmerBoard(players.size());
        this.bank = new Bank();
        this.market = new Market();
    }

    private void addPlayers(){
        System.out.println("Podaj liczbę graczy: ");
        int numberOfPlayers = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i<numberOfPlayers; i++){
            System.out.println("Podaj imię gracza nr " + (players.size()+1) + ": ");
            String name = sc.nextLine();
            players.add(new Player(name));
        }
    }

    private Player whoStarts(){
        int theLowestScore = 1000;
        Player theLowestPlayer = null;
        for (Player e : players){
            if(e.getSumOfMoneyDices(e.getMoneyDices())<theLowestScore){
                theLowestPlayer = e;
            }
        }
        return theLowestPlayer;
    }

    public void makeTurn(Player player){
        boolean isTurnFinished = false;
        LinkedList<MoneyDice> currentMoneyDices = player.getMoneyDices();
        System.out.println("Teraz ruch gracza o imieniu: " + player.getName()+"\n");

        while (!isTurnFinished) {
            player.printMoneyDices(currentMoneyDices);
            System.out.println(market.toString());
            if (bank.isExchangePossible()){
                System.out.println(bank.toString());
                System.out.println("Co chcesz zrobic: \n1 - zakończyć kolejkę\n2 - kupić zwierzę\n3 - wymienić pieniądze w banku");
            } else {
                System.out.println("Co chcesz zrobic: \n1 - zakończyć kolejkę\n2 - kupić zwierzę\n");
            }
            int decision = sc.nextInt();
            sc.nextLine();
            if (decision == 1){
                isTurnFinished = true;
            } else if (decision == 2){
                buyAnimal();
            } else if (decision == 3){
                changeMoney();
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public void buyAnimal(){
        Slot slotToBuy;
        System.out.println("Które zwierzę chcesz kupić?");
        int ans = sc.nextInt();
        sc.nextLine();
        switch (ans){
            case 1:
                slotToBuy = market.getSlotA();
                break;
            case 2:
                slotToBuy = market.getSlotB();
                break;
            case 3:
                slotToBuy = market.getSlotC();
                break;
            case 4:
                slotToBuy = market.getSlotD();
                break;
            default:
                throw new IllegalArgumentException();
        }
        if (!slotToBuy.isBought()){
            System.out.println("Którą kost");
            slotToBuy.buy();
        } else {
            System.out.println("Już kupiłeś to zwierzę");
        }


    }

    public void changeMoney(){

        if (bank.isExchangePossible()) {
            System.out.println("Którą kość chcesz wymienić?");
            System.out.println("1 - pierwsza niebieska,\n2 - druga niebieska,\n3 - zielona,\n4 - czerwona");
            int ans = sc.nextInt();
            sc.nextLine();
            MoneyDice diceToExchange = null;

            switch (ans){
                case 1:
                    diceToExchange = activePlayer.getBlue1();
                    break;
                case 2:
                    diceToExchange = activePlayer.getBlue2();
                    break;
                case 3:
                    diceToExchange = activePlayer.getGreen();
                    break;
                case 4:
                    diceToExchange = activePlayer.getRed();
                    break;
                default:
                    throw new IllegalArgumentException();
            }

            int exchangedValue = bank.exchangeDice(diceToExchange);
            diceToExchange.setValue(exchangedValue);

        } else {
            System.out.println("W tej rundzie możesz już wymieniać kostek w banku");
        }

    }


}
