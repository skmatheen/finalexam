public class VeggiePizza implements Pizza {
    private String description = "Vegetarian Pizza with bell peppers, onions, and mushrooms";
    private double cost = 8.50;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        System.out.println("Cost of VeggieDough: " + 6.00);
        return cost;
    }
}
