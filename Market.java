import java.util.LinkedList;

public class Market {
    private Slot slotA = new Slot(AnimalDice.TypeAnimal.A);
    private Slot slotB = new Slot(AnimalDice.TypeAnimal.B);
    private Slot slotC = new Slot(AnimalDice.TypeAnimal.C);
    private Slot slotD = new Slot(AnimalDice.TypeAnimal.D);

    public LinkedList<Slot> getMarket() {
        LinkedList<Slot> marketSlots = new LinkedList<>();
        marketSlots.add(getSlotA());
        marketSlots.add(getSlotB());
        marketSlots.add(getSlotC());
        marketSlots.add(getSlotD());
        return marketSlots;
    }



    @Override
    public String toString(){
        String output = "Zwierzęta na targu:\n";
        int number = 1;
        for (Slot slot : getMarket()){
            Animal animal = slot.getAnimalDice().getAnimal();
            output += number + ": " + animal.getName() + ", cena: " + animal.getPrice() + ", kupione: " + slot.isBought() + "\n";
            number++;
        }
        return output;
    }

    public Slot getSlotA() {
        return slotA;
    }

    public Slot getSlotB() {
        return slotB;
    }

    public Slot getSlotC() {
        return slotC;
    }

    public Slot getSlotD() {
        return slotD;
    }
}