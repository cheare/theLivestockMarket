import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmerBoardTest {

    @Test
    void addPosition() {
        FarmerBoard farmerBoard = new FarmerBoard(2);
        farmerBoard.addPosition();
        farmerBoard.addPosition();
        int afterTwoMoves = 2;
        assertEquals(afterTwoMoves, farmerBoard.getPosition());
    }
}