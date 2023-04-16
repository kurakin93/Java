package OOP.HW1;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, int volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                BottleOfWater bottle = ((BottleOfWater) product);
                if (bottle.name.equals(name) && bottle.getVolume() == volume)
                    return bottle;
            }
        }
        return null;
    }

        public Сhocolate getСhocolate(String name, int weight){
        for (Product product: products) {
            if (product instanceof Сhocolate){
                Сhocolate сhocolate = ((Сhocolate)product);
                if (сhocolate.name.equals(name) && сhocolate.getWeight() == weight)
                    return сhocolate;
            }
        }
        return null;
    }


}
