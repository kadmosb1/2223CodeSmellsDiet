/*
 * Het kan nog eenvoudiger door een class Dish te maken met een constructor.
 */
public class Dish {

    private String name;
    private double vitaminC;
    private double calories;

    public Dish (String name, double vitaminC, double calories) {
        this.name = name;
        this.vitaminC = vitaminC;
        this.calories = calories;
    }

    public double getVitaminC () {
        return vitaminC;
    }

    public double getCalories () {
        return calories;
    }
}
