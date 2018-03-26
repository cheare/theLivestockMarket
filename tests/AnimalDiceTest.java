import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalDiceTest {
    @Test
    void getAnimalA() {
        AnimalDice animalDiceA = new AnimalDice(AnimalDice.TypeAnimal.A);
        animalDiceA.throwDice();
        String testedAnimalName = animalDiceA.getAnimal().getName();
        List allowed = List.of("Pig", "Chicken", "Farmer");
        boolean isAllowed = allowed.contains(testedAnimalName);
        assertTrue(isAllowed);
    }
    @Test
    void getAnimalB() {
        AnimalDice animalDiceB = new AnimalDice(AnimalDice.TypeAnimal.B);
        animalDiceB.throwDice();
        String testedAnimalName = animalDiceB.getAnimal().getName();
        List allowed = List.of("Sheep", "Cow", "Farmer");
        boolean isAllowed = allowed.contains(testedAnimalName);
        assertTrue(isAllowed);
    }
    @Test
    void getAnimalC() {
        AnimalDice animalDiceC = new AnimalDice(AnimalDice.TypeAnimal.C);
        animalDiceC.throwDice();
        String testedAnimalName = animalDiceC.getAnimal().getName();
        List allowed = List.of("Cow", "Chicken", "Farmer");
        boolean isAllowed = allowed.contains(testedAnimalName);
        assertTrue(isAllowed);
    }
    @Test
    void getAnimalD() {
        AnimalDice animalDiceD = new AnimalDice(AnimalDice.TypeAnimal.D);
        animalDiceD.throwDice();
        String testedAnimalName = animalDiceD.getAnimal().getName();
        List allowed = List.of("Pig", "Sheep", "Farmer");
        boolean isAllowed = allowed.contains(testedAnimalName);
        assertTrue(isAllowed);
    }

}