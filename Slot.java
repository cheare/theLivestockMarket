public class Slot {
    private boolean isBought;
    private DiceAnimal diceAnimal;

    Slot(DiceAnimal.TypeAnimal type){
        this.diceAnimal = new DiceAnimal(type);
    }

    public int buy(){
        this.isBought = true;
        return diceAnimal.getAnimal().getPrice();
    }

    public void resetSlot(){
        this.isBought = false;
        this.diceAnimal.throwDice();
    }

    public boolean isBought() {
        return this.isBought;
    }

    public Animal getAnimal() {
        return this.diceAnimal.getAnimal();
    }



}
