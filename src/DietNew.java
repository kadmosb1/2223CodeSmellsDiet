public class DietNew {
    public double vitaminC;
    public double calories;

    /*
     * De code smell switch-statement is verdwenen en er wordt gebruik
     * gemaakt van polymorfisme m.b.v. de interface IProduct (Replace
     * Contional with Polymorphism).
     */
    public void eat (IDish dish) {
        this.vitaminC += dish.getVitaminC ();
        this.calories += dish.getCalories ();
    }

    /*
     * Dit is een variant van het verwijderen van Primitive Obsession die
     * nog meer elementair is, maar die niet voorkomt als oplossing
     * in de opgegeven literatuur.
     */
    public void eat (Dish dish) {
        this.vitaminC += dish.getVitaminC ();
        this.calories += dish.getCalories ();
    }

    public double getVitaminC () {
        return vitaminC;
    }

    public double getCalories () {
        return calories;
    }
}
