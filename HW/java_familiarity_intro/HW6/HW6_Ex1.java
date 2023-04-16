package java_familiarity_intro.HW6;

import HW.java_familiarity.HW6.model.Model_laptop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW6_Ex1 {
    /**
     * Задание на дом :
     * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
     * • Создать множество ноутбуков.
     * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
     * Критерии фильтрации можно хранить в Map. Например:
     * “Введите цифру, соответствующую необходимому критерию:
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет …
     * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
     * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
     */
    public static void main(String[] args) {
        action_selection();
    }

    /**
     * Основное меню программы
     */
    static void action_selection() {
        System.out.println("""
                Меню:\s
                1. Открыть весь список ноутбуков\s
                2. Фильтр ноутбуков:\s
                3. Выход\s
                """);
        Scanner sc = new Scanner(System.in);
        List<Model_laptop> temp = laptop_Database();
        int num = sc.nextInt();
        if (num == 1 || num == 2 || num == 3) {
            switch (num) {
                case 1: {
                    print_laptop(temp);
                    action_selection();
                    break;
                }
                case 2: {
                    sorting_action_selection(temp);
                    action_selection();
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    System.out.println("Ввели не правильное число! Введите еще раз. ");
                }
            }
        }
    }

    static void sorting_action_selection(List<Model_laptop> temp) {
        System.out.println("""
                Фильтр по:\s
                1. Процессору\s
                2. Размеру экрана:\s
                3. Объему DDR\s
                4. OS\s
                5. Цвету\s
                6. Объему HDD\s
                7. Видеокарте\s
                8. Весу\s
                9. Цене\s
                10. Выход""");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1: {
                temp = sorting_processor_model(temp);
                print_laptop(temp);
                sorting_action_selection(temp);
                break;
            }
            case 2: {
                temp = sorting_screen_size(temp);
                print_laptop(temp);
                sorting_action_selection(temp);
                break;
            }
            case 3: {
                temp = sorting_amount_of_memory(temp);
                print_laptop(temp);
                sorting_action_selection(temp);
                break;
            }
            case 4: {
                temp = sorting_operating_system(temp);
                print_laptop(temp);
                sorting_action_selection(temp);
                break;
            }
            case 5: {
                temp = sorting_color(temp);
                print_laptop(temp);
                sorting_action_selection(temp);
                break;
            }
            case 6: {
                temp = sorting_drive_capacity(temp);
                print_laptop(temp);
                sorting_action_selection(temp);
                break;
            }
            case 7: {
                temp = sorting_graphics_card_model(temp);
                print_laptop(temp);
                sorting_action_selection(temp);
                break;
            }
            case 8: {
                temp = sorting_weight(temp);
                print_laptop(temp);
                sorting_action_selection(temp);
                break;
            }
            case 9: {
                temp = sorting_price(temp);
                print_laptop(temp);
                sorting_action_selection(temp);
                break;
            }
            case 10: {
                break;
            }
            default: {
                System.out.println("Введите число от 1 до 10");
            }
        }
    }

    static List<Model_laptop> laptop_Database() {
        Model_laptop laptop0 = new Model_laptop("amd fx-8350", 15, 8, "Windows", "red", 512, "GeForce", 1245, 9832);
        Model_laptop laptop1 = new Model_laptop("amd ryzen 5", 16, 10, "Windows", "green", 750, "AMD", 1564, 7914);
        Model_laptop laptop2 = new Model_laptop("amd ryzen 3", 17, 4, "Windows", "black", 256, "GeForce", 897, 8946);
        Model_laptop laptop3 = new Model_laptop("amd athlon", 18, 12, "Linux", "orange", 1000, "GeForce", 3212, 9874);
        Model_laptop laptop4 = new Model_laptop("amd phenom", 19, 16, "Linux", "blue", 1500, "AMD", 6547, 1497);
        Model_laptop laptop5 = new Model_laptop("amd sempron", 20, 32, "Apple Mac OS X", "grey", 256, "AMD", 2414, 9879);
        Model_laptop laptop6 = new Model_laptop("intel core i3", 15, 4, "Windows", "yellow", 128, "GeForce", 3215, 4561);
        Model_laptop laptop7 = new Model_laptop("intel core i5", 16, 8, "Apple Mac OS X", "white", 500, "AMD", 3218, 1974);
        Model_laptop laptop8 = new Model_laptop("intel pentium ", 17, 16, "Linux", "red-black", 256, "GeForce", 1564, 3164);
        Model_laptop laptop9 = new Model_laptop("intel celeron", 18, 32, "Apple Mac OS X", "red", 512, "GeForce", 1597, 1567);
        Model_laptop laptop10 = new Model_laptop("intel xeon", 19, 36, "Windows", "black", 512, "AMD", 8923, 66);
        List<Model_laptop> model_laptop = new ArrayList<>();
        model_laptop.add(laptop0);
        model_laptop.add(laptop1);
        model_laptop.add(laptop2);
        model_laptop.add(laptop3);
        model_laptop.add(laptop4);
        model_laptop.add(laptop5);
        model_laptop.add(laptop6);
        model_laptop.add(laptop7);
        model_laptop.add(laptop8);
        model_laptop.add(laptop9);
        model_laptop.add(laptop10);
        return model_laptop;
    }

    static void print_laptop(List<Model_laptop> model_laptop) {
        for (Model_laptop elem : model_laptop) {
            System.out.println(elem);
        }
    }

    static List<Model_laptop> sorting_processor_model(List<Model_laptop> model_laptop) {
        List<Model_laptop> temp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите модель процессора: ");
        String processor_model = sc.nextLine();
        for (Model_laptop elem : model_laptop) {
            if (compare(elem.getProcessor_model(), processor_model)) {
                temp.add(elem);
            }
        }
        return temp;
    }

    static List<Model_laptop> sorting_screen_size(List<Model_laptop> model_laptop) {
        List<Model_laptop> temp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите минимальный размер дисплея: ");
        Integer screen_size = sc.nextInt();
        for (Model_laptop elem : model_laptop) {
            if (elem.getScreen_size() >= screen_size) {
                temp.add(elem);
            }
        }
        return temp;
    }

    static List<Model_laptop> sorting_amount_of_memory(List<Model_laptop> model_laptop) {
        List<Model_laptop> temp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите минимальный объем DDR: ");
        Integer amount_of_memory = sc.nextInt();
        for (Model_laptop elem : model_laptop) {
            if (elem.getAmount_of_memory() >= amount_of_memory) {
                temp.add(elem);
            }
        }
        return temp;
    }

    static List<Model_laptop> sorting_operating_system(List<Model_laptop> model_laptop) {
        List<Model_laptop> temp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите OS: ");
        String operating_system = sc.nextLine();
        for (Model_laptop elem : model_laptop) {
            if (compare(elem.getOperating_system(), operating_system)) {
                temp.add(elem);
            }
        }
        return temp;
    }

    static List<Model_laptop> sorting_color(List<Model_laptop> model_laptop) {
        List<Model_laptop> temp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цвет: ");
        String color = sc.nextLine();
        for (Model_laptop elem : model_laptop) {
            if (compare(elem.getColor(), color)) {
                temp.add(elem);
            }
        }
        return temp;
    }

    static List<Model_laptop> sorting_drive_capacity(List<Model_laptop> model_laptop) {
        List<Model_laptop> temp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите минимальный объем HDD: ");
        Integer drive_capacity = sc.nextInt();
        for (Model_laptop elem : model_laptop) {
            if (elem.getDrive_capacity() >= drive_capacity) {
                temp.add(elem);
            }
        }
        return temp;
    }

    static List<Model_laptop> sorting_graphics_card_model(List<Model_laptop> model_laptop) {
        List<Model_laptop> temp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите модель видеокарты: ");
        String graphics_card_model = sc.nextLine();
        for (Model_laptop elem : model_laptop) {
            if (compare(elem.getGraphics_card_model(), graphics_card_model)) {
                temp.add(elem);
            }
        }
        return temp;
    }

    static List<Model_laptop> sorting_weight(List<Model_laptop> model_laptop) {
        List<Model_laptop> temp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите минимальный вес: ");
        Integer weight = sc.nextInt();
        for (Model_laptop elem : model_laptop) {
            if (elem.getWeight() >= weight) {
                temp.add(elem);
            }
        }
        return temp;
    }

    static List<Model_laptop> sorting_price(List<Model_laptop> model_laptop) {
        List<Model_laptop> temp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите минимальную цену: ");
        Integer price = sc.nextInt();
        for (Model_laptop elem : model_laptop) {
            if (elem.getPrice() >= price) {
                temp.add(elem);
            }
        }
        return temp;
    }

    static List<Model_laptop> temp(Model_laptop elem) {
        List<Model_laptop> temp = new ArrayList<>();
        temp.add(elem);
        return temp;
    }

    static boolean compare(String stringname, String string) {
        return stringname.contains(string);
    }
}

