package HW.java_familiarity.HW5;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        entryAmounts();
    }

    /**
     * Подсчитать количество вхождения каждого слова
     * Пример:
     * Россия идет вперед всей планеты. Планета — это не Россия.
     * toLoverCase().
     */
    static void entryAmounts() {
        String[] symbols = {" ", ".", ",", "—", "-","!","?","«","»"};
        String[] newResult = "Россия идет вперед всей планеты. Планета — это не Россия.".toLowerCase().split(Arrays.toString(symbols));
        List<String> text = new ArrayList<>();
        Map<String, Integer> elementText = new HashMap<>();
        int count = 0;
        for (int i = 0; i < newResult.length; i++) {
            if (newResult[i].isEmpty() == false) {
                text.add(newResult[i]);
                elementText.putIfAbsent(newResult[i], count);
            }
        }
        for (Map.Entry<String, Integer> elem : elementText.entrySet()) {
            count=0;
            for (String elem1 : text) {
                if (elem.getKey() == elem1.intern()) {
                    count ++;
                    elementText.put(elem.getKey(), count);
                }
            }
        }
        System.out.println(elementText);
    }
    static void entryAmountsNew(){
        String[] symbols = {" ", ".", ",", "—", "-","!","?","«","»"};
        String[] newResult = "Россия идет вперед всей планеты. Планета — это не Россия.".toLowerCase().split(Arrays.toString(symbols));
        int count = 0;
            
        }
    }



