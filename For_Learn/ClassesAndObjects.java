package For_Learn;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("PAvel");
        person1.setAge(15);
        System.out.println("--------" + person1.getName());
        System.out.println("--------" + person1.getAge());
//        person1.setName("Роман");
//        person1.name = "Рома";
//        person1.age = 50;
//        person1.sayHello();
//        person1.speak();
//        System.out.println("Меня зовут " + person1.name + "," + "мне " + person1.age + " лет");
        Person person2 = new Person();
//        person2.name = "Вова";
//        person2.age = 20;
//        person2.speak();
//        int years1 = person1.calculateYearsToRetirement();
//        int years2 =person2.calculateYearsToRetirement();
//        System.out.println(years1);
//        System.out.println(years2);
//        System.out.println("Меня зовут " + person2.name + "," + "мне " + person2.age + " лет");
    }
}

/**
 * У класса могут быть...
 * 1. Данные (поля)
 * 2. Действия, которые он может совершать(методы)
 */
class Person {
    private String name;
    private int age;

    int calculateYearsToRetirement(){//void не возвращает ни чего, а int, bool, char и т.д возвращает
        int years = 65 - age;
        return years;
    }
    void speak(){
        System.out.println("Меня зовут " + name + "," + "мне " + age + " лет");

    }
    void sayHello(){
        System.out.println("Привет..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
