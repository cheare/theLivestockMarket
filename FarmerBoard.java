import java.util.ArrayList;
import java.util.Arrays;

public class FarmerBoard {
    private int size;
    private ArrayList<Integer> farmerOnMarketPositions = new ArrayList<>();
    private int position;

    public int getPosition() {
        return position;
    }

    public void addPosition() {
        this.position++;
    }

    FarmerBoard(int numberOfPlayers){
        if (numberOfPlayers > 2 && numberOfPlayers <= 4){
            this.size = 14;
            this.farmerOnMarketPositions.add(5);
            this.farmerOnMarketPositions.add(9);
        } else if (numberOfPlayers == 2){
            this.size = 11;
            this.farmerOnMarketPositions.add(4);
            this.farmerOnMarketPositions.add(7);
        } else {
            throw new IllegalArgumentException("Min player number is 2 and max is 4");
        }
    }


}
