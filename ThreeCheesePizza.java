// Correct implementation of the Pizza interface by ThreeCheesePizza
public class ThreeCheesePizza implements Pizza {
    private String description = "Mozzarella, Fontina, Parmesan Cheese Pizza";
    private double cost = 10.50;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
