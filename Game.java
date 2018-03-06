import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    private LinkedList<Player> players = new LinkedList<>();
    private FarmerBoard farmerBoard;
    private Bank bank;
    private Market market;
    public Player whoseTurn;

    public Game(){
        addPlayers();
        this.whoseTurn = whoStarts();
        this.farmerBoard = new FarmerBoard(players.size());
        this.bank = new Bank();
        this.market = new Market();
    }

    private void addPlayers(){
        Scanner sc = new Scanner(System.in);
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Teraz ruch gracza o imieniu: " + player.getName()+"\n");

        while (!isTurnFinished) {
            player.printMoneyDices(currentMoneyDices);
            market.printMarket();
            if (bank.isExchangePossible()){
                bank.printBank();
                System.out.println("Co chcesz zrobic: \n1 - kupić zwierzę\n2 - zakończyć kolejkę\n3 - wymienić pieniądze w banku");
            } else {
                System.out.println("Co chcesz zrobic: \n1 - kupić zwierzę\n2 - zakończyć kolejkę");
            }
            int decision = sc.nextInt();
            if (decision == 2){
                isTurnFinished = true;
            }



        }
    }


}
