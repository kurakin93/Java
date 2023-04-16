package OOP.HW1;

public class Product {

    protected String name;
    protected String brand;
    protected  double price;

    public double getPrice(){
        return price;
    }

    //mutator
    public void setPrice(double price){
        if (price <= 0)
            throw new RuntimeException("Некорректная сумма товара.");
        this.price = price;
    }

    // accessor
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
//
//    int param1;
//    String param2;
//    boolean param3;
//    String param4;
//
//    {
//        System.out.println("Initializer");
//        param1 = 100;
//        param2 = "...";
//        param3 = true;
//        param4 = "====";
//    }

    public Product(){
        this("Продукт");
    }

    public Product(String name){
        this(name, 1);
    }
    public Product(String name, double price){
        this("Noname", name, price);
    }

    public Product(String brand, String name, double price){
//        System.out.println("Constructor");
        if (brand.length() < 3)
            this.brand = "Noname";
        else
            this.brand = brand;

        if (name.length() < 3)
            this.name = "Товар";
        else
            this.name = name;

        if (price <= 0)
            throw new RuntimeException("Некорректная сумма товара.");
        this.price = price;
    }


    /**
     * Получить информацию по продукту
     * @return Информация по продукту
     */
    public String displayInfo(){
        return String.format("%s - %s - %f", brand, name, price);
    }


}
