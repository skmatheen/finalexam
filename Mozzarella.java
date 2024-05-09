public class Mozzarella extends ToppingDecorator {
    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Mozzarella");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", mozzarella";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Mozzarella: " + 0.50);
        return tempPizza.getCost() + 0.50;
    }
}
