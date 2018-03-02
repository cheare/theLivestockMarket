public class ScoringBoard {
    private int points;
    private int chickenAmount;
    private int sheepAmount;
    private int pigAmount;
    private int cowAmount;

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public int getChickenAmount() {
        return chickenAmount;
    }

    public void addChickenAmount() {
        this.chickenAmount++;
    }

    public void removeChickenAmount() {
        this.chickenAmount--;
    }

    public int getSheepAmount() {
        return sheepAmount;
    }

    public void addSheepAmount() {
        this.sheepAmount++;
    }

    public void removeSheepAmount() {
        this.sheepAmount--;
    }

    public int getPigAmount() {
        return pigAmount;
    }

    public void addPigAmount() {
        this.pigAmount++;
    }

    public void removePigAmount() {
        this.pigAmount--;
    }

    public int getCowAmount() {
        return cowAmount;
    }

    public void addCowAmount() {
        this.cowAmount++;
    }

    public void removeCowAmount() {
        this.cowAmount--;
    }
}
