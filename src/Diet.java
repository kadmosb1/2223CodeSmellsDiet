// Diet.java in src
public class Diet {

    public static final int APPLE = 1;
    public static final int BROCCOLI = 2;
    public static final int BREAD = 3;

    public double vitaminC;
    public double calories;

    public void eat(int dish)
    {
        switch (dish)
        {
            case APPLE:
                this.vitaminC += 81;
                this.calories += 8;
                break;
            case BROCCOLI:
                this.vitaminC += 48;
                this.calories += 26;
                break;
            case BREAD:
                this.vitaminC += 0;
                this.calories += 69;
                break;
            default:
                break;
        }
    }

    public double getVitaminC () {
        return vitaminC;
    }

    public double getCalories () {
        return calories;
    }
}
