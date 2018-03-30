import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmerBoardTest {

    @Test
    void addPositionTest() {
        FarmerBoard farmerBoard = new FarmerBoard(2);
        farmerBoard.addPosition();
        farmerBoard.addPosition();
        int afterTwoMoves = 2;
        assertEquals(afterTwoMoves, farmerBoard.getPosition());
    }

    @Test
    void illegalSizeTestTooSmall() {
        try {
            FarmerBoard farmerBoard = new FarmerBoard(1);
        } catch (IllegalArgumentException e) {
            assertEquals("Min player number is 2 and max is 4", e.getMessage());
        }
    }

    @Test
    void illegalSizeTestTooBig() {
        try {
            FarmerBoard farmerBoard = new FarmerBoard(11);
        } catch (IllegalArgumentException e) {
            assertEquals("Min player number is 2 and max is 4", e.getMessage());
        }
    }

    @Test
    void isFarmerOnMarketTest(){
        FarmerBoard farmerBoard = new FarmerBoard(2);
        assertFalse(farmerBoard.isFarmerOnMarket());
        for (int i = 0; i<3; i++){
            farmerBoard.addPosition();
            assertFalse(farmerBoard.isFarmerOnMarket());
        }
        farmerBoard.addPosition();
        assertTrue(farmerBoard.isFarmerOnMarket());
        farmerBoard.addPosition();
        assertFalse(farmerBoard.isFarmerOnMarket());
    }
}