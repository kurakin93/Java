package HW.java_familiarity.HW6.model;


import lombok.AllArgsConstructor;
import lombok.Data;

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
@Data
@AllArgsConstructor

public class Model_laptop {
    private String processor_model;
    private Integer screen_size;
    private Integer amount_of_memory;
    private String operating_system;
    private String color;
    private Integer drive_capacity;
    private String graphics_card_model;
    private Integer weight;
    private Integer price;
}