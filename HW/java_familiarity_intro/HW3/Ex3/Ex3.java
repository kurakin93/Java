package java_familiarity_intro.HW3.Ex3;

import java_familiarity_intro.HW3.Ex3.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о книге состоят из
 * названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых
 * простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Ex3 {
    public static void main(String[] args) {
        Book bk0 = new Book("Пикник", "Стругацкий", 27, 2015, 758);
        Book bk1 = new Book("Война и мир", "Толстой", 89, 1930, 227);
        Book bk2 = new Book("Муму", "Тургенав", 48, 2010, 233);
        Book bk3 = new Book("Ночь перед рождеством", "Гаголь", 53, 2011, 1627);
        List<Book> bookList = new ArrayList<>();
        bookList.add(bk0);
        bookList.add(bk1);
        bookList.add(bk2);
        bookList.add(bk3);
        for (Book el: bookList) {
            if(simpleNumber(el.getNumbPages()) && (el.getYearsOFpublication() >= 2010) && compare(el.getAuthorName())){
                System.out.println(el.getName());
            }
        }
    }

    /**
     * проверяет простое число либо нет
     * @param number число
     * @return true/false
     */
    static boolean simpleNumber(int number) {
        int count;
        for (int i = 0; i < number; i++) {
            count = 0;
            for (int j = 2; j < number + 1; j++) {
                if (number % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                return true;
            }
        }
        return false;
    }
    /**
     *
     * @param str принимает строку
     * @return возвращает правда/лошь на вхождение подстроки в строку
     */
    static boolean compare(String str) {
        if(str.indexOf("а") == -1){
            return false;
        }
        return true;
    }
}
