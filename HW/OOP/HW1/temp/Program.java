package OOP.HW1.temp;

public class Program {
    /**
     * 1 Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
     * 2 Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
     * getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
     * 3 В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
     * 4 Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
     *
     * @param args
     */
    public static void main(String[] args) {
        CoffeeDrinks coffeeDrinks1 = new CoffeeDrinks("coffee", 350, 50);
//coffeeDrinks1.getProduct(coffeeDrinks1, "coffee");
    }
}
