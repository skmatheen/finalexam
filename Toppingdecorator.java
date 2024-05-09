abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza; // Reference to decorated pizza

    public ToppingDecorator(Pizza newPizza) {
        this.tempPizza = newPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
