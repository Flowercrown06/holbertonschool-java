import mood.*;
import food.*;
public class Character {
    private int happinessPoints;

    public Character() {
        this.happinessPoints = 0;
    }

    public void eat(Food[] foods) {
        for (Food food : foods) {
            this.happinessPoints += food.getHappinessPoints();
        }
    }

    public Mood getCurrentMood() {
        if (happinessPoints < -5) {
            return new Angry();
        } else if (happinessPoints <= 0) {
            return new Sad();
        } else if (happinessPoints <= 15) {
            return new Happy();
        } else {
            return new VeryHappy();
        }
    }

//    @Override
//    public String toString() {
//        return happinessPoints + " - " + getCurrentMood().getClass().getSimpleName();
//    }
    @Override
    public String toString() {
        return String.format("%d - %s", happinessPoints, getCurrentMood().toString());
    }
}

