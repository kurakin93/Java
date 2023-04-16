package OOP.HW1.temp;
/**
 *1 Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 *2 Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
 * getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
 *3 В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
 *4 Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class HotDrinks {
    protected String name;
    protected int volume;

    public HotDrinks(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    public String getProduct(HotDrinks drinks, String name){
        if(name == drinks.name){
            return String.format("Name: %s Volume: %d", this.name,this.volume);
        }
        return null;
    }

}
