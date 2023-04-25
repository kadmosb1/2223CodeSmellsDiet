// DietTest.java in test

import org.junit.Test;
import static org.junit.Assert.*;

public class DietTest {
    @Test
    public void testDiet () {
        Diet diet = new Diet ();
        diet.eat (Diet.APPLE);
        diet.eat (Diet.BROCCOLI);
        diet.eat (Diet.BREAD);
        assertEquals (129, diet.getVitaminC(), 0.1);
        assertEquals (103, diet.getCalories(), 0.1);
    }

    @Test
    public void testNewDietWithIDish () {
        DietNew diet = new DietNew ();
        diet.eat (new Apple ());
        diet.eat (new Broccoli ());
        diet.eat (new Bread ());
        assertEquals (129, diet.getVitaminC(), 0.1);
        assertEquals (103, diet.getCalories(), 0.1);
    }

    @Test
    public void testNewDietWithDish () {
        DietNew diet = new DietNew ();
        diet.eat (new Dish ("Apple", 81, 8));
        diet.eat (new Dish ("Broccoli", 48, 26));
        diet.eat (new Dish ("Bread", 0, 69));
        assertEquals (129, diet.getVitaminC(), 0.1);
        assertEquals (103, diet.getCalories(), 0.1);
    }
}