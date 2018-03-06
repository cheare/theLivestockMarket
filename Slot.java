public class Slot {
    private boolean isBought;
    private AnimalDice animalDice;

    Slot(AnimalDice.TypeAnimal type){
        this.animalDice = new AnimalDice(type);
    }

    public int buy(){
        this.isBought = true;
        return animalDice.getAnimal().getPrice();
        /*

        TBC


         */
    }

    public void resetSlot(){
        this.isBought = false;
        this.animalDice.throwDice();
    }

    public boolean isBought() {
        return this.isBought;
    }

    public AnimalDice getAnimalDice() {
        return this.animalDice;
    }



}
