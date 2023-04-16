package java_familiarity_intro.HW3.Ex1;

import java_familiarity_intro.HW3.Ex1.model.Items;

import java.util.ArrayList;
import java.util.List;


/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший»
 */
public class Example1 {
    public static void main(String[] args) {
        Items items0 = new Items("Высший", 120, 1);
        Items items1 = new Items("Высший сорт", 50, 2);
        Items items2 = new Items("Высший класс", 342, 1);
        Items items3 = new Items("Мука", 546, 2);
        Items items4 = new Items("Хлеб", 45, 1);
        Items items5 = new Items("Высший", 65, 2);
        Items items6 = new Items("Класс", 23, 1);
        Items items7 = new Items("Батон", 567, 2);
        Items items8 = new Items("Бабайка", 54, 1);
        Items items9 = new Items("Балалайка", 567, 1);
        Items items10 = new Items("Высший", 67, 2);
        List<Items> arrItems = new ArrayList<>();
        arrItems.add(items0);
        arrItems.add(items1);
        arrItems.add(items2);
        arrItems.add(items3);
        arrItems.add(items4);
        arrItems.add(items5);
        arrItems.add(items6);
        arrItems.add(items7);
        arrItems.add(items8);
        arrItems.add(items9);
        arrItems.add(items10);
        String str = "Высший";
        System.out.println(compare(items2.getName(), str));

        List<Integer> price = new ArrayList<>();
        for (Items elem:
             arrItems) {
            if (compare(elem.getName(), str)){
                price.add(elem.getPrice());
            }
        }
        System.out.println(price);
        int max = 0;
        for (Integer pr:
             price) {
            if (pr > max){
                max = pr;
            }
        }
        System.out.println(max);
    }
    static boolean compare(String stringname, String string){
        return stringname.startsWith(string);
    }

}
