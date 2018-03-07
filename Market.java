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

    public void printMarket(){
        System.out.println("Zwierzęta na targu: ");
        int number = 1;
        for (Slot slot : getMarket()){
            Animal animal = slot.getAnimalDice().getAnimal();
            System.out.println(number + ": " + animal.getName() + ", cena: " + animal.getPrice() + ", kupione: " + slot.isBought());
            number++;
        }

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