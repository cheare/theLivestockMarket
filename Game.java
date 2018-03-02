import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    public LinkedList<Player> players = new LinkedList<>();


    public void prepareToGame(){
        addPlayers();
        FarmerBoard farmerBoard = new FarmerBoard(players.size());
        Bank bank = new Bank();
        Market market = new Market();

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
}
