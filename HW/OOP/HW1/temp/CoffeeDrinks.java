package OOP.HW1.temp;

/**
 * 1 Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * 2 Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
 * getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
 * 3 В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
 * 4 Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class CoffeeDrinks extends HotDrinks {

    public int temperature;

    public CoffeeDrinks(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
//    public String getProduct() {
//        return String.format("%s  Temperature: %d", super.getProduct(), this.temperature);
//    }
}
