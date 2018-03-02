import java.util.ArrayList;

public class DiceAnimal extends Dice{
    private ArrayList<Animal> animals = new ArrayList<>();
    private Animal animal;

    public void throwDice(){
        super.throwDice();
        this.animal = animals.get(this.value);
    }

    public Animal getAnimal() {
        return animal;
    }

    public enum TypeAnimal {
        A, B, C, D;
    }

    DiceAnimal(TypeAnimal type){
        switch (type){
            case A:
                this.animals.add(new Animal("Pig",10));
                this.animals.add(new Animal("Pig",12));
                this.animals.add(new Animal("Chicken",3));
                this.animals.add(new Animal("Chicken",2));
                this.animals.add(new Animal("Farmer",0));
                this.animals.add(new Animal("Farmer",0));
                break;
            case B:
                this.animals.add(new Animal("Sheep",3));
                this.animals.add(new Animal("Sheep",5));
                this.animals.add(new Animal("Cow",15));
                this.animals.add(new Animal("Cow",16));
                this.animals.add(new Animal("Farmer",0));
                this.animals.add(new Animal("Farmer",0));
                break;
            case C:
                this.animals.add(new Animal("Cow",12));
                this.animals.add(new Animal("Cow",13));
                this.animals.add(new Animal("Chicken",4));
                this.animals.add(new Animal("Chicken",6));
                this.animals.add(new Animal("Farmer",0));
                this.animals.add(new Animal("Farmer",0));
                break;
            case D:
                this.animals.add(new Animal("Pig",7));
                this.animals.add(new Animal("Pig",9));
                this.animals.add(new Animal("Sheep",6));
                this.animals.add(new Animal("Sheep",8));
                this.animals.add(new Animal("Farmer",0));
                this.animals.add(new Animal("Farmer",0));
                break;
        }
    }
}
