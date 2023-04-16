package OOP.HW1;

public class Сhocolate extends Product {
    private double weight;
    private double calories;


    public Сhocolate(String brand, String name, double price, double weight, double calories) {
        super(brand, name, price);
        this.calories = calories;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
