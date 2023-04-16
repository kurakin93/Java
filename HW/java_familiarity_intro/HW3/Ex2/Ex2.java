package java_familiarity_intro.HW3.Ex2;


import java_familiarity_intro.HW3.Ex2.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о товаре состоят из наименования, страны-производителя,
 * веса, цены, сорта. Получить наименования товаров
 * заданного сорта с наименьшей ценой.
 */
public class Ex2 {
    public static void main(String[] args) {
        Product pr0 = new Product("Хлеб", "Беларусь", 123, 1, 1);
        Product pr1 = new Product("Молоко", "Россия", 24, 3, 2);
        Product pr2 = new Product("Кефир", "Украина", 53, 4, 1);
        Product pr3 = new Product("Творог", "Беларусь", 476, 6, 2);
        Product pr4 = new Product("Кукуруза", "Украина", 234, 2, 2);
        Product pr5 = new Product("Картошка", "Россия", 789, 89, 2);
        Product pr6 = new Product("Сыр", "Украина", 5, 60, 1);
        Product pr7 = new Product("Рыба", "Украина", 546, 23, 1);
        List<Product> arrItems = new ArrayList<>();
        arrItems.add(pr0);
        arrItems.add(pr1);
        arrItems.add(pr2);
        arrItems.add(pr3);
        arrItems.add(pr4);
        arrItems.add(pr5);
        arrItems.add(pr6);
        arrItems.add(pr7);
        int type = 2;
        int min = 0;
        List<Integer> price = new ArrayList<>();
        for (Product el :
                arrItems) {
            if (el.getType().equals(type)) {
                price.add(el.getPrice());
                min = price.get(0);
                for (Integer pr :
                        price) {
                    if (pr < min) {
                        min = pr;
                    }
                }
            }
        }
        for (Product item :
                arrItems) {
            if (item.getPrice().equals(min)) {
                System.out.println(item.getName());

            }

        }
    }
}
