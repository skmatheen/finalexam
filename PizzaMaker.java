public class PizzaMaker {

    public static void main(String[] args){
        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());


        Pizza vegPizza = new TomatoSauce(new Mozzarella(new VeggiePizza()));
        System.out.println("Ingredients: " + vegPizza.getDescription());
        System.out.println("Price: " + vegPizza.getCost());
    }
}