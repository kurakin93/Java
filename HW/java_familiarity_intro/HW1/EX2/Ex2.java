package HW.java_familiarity.HW1.EX2;

import java.util.Scanner;

/**
 * 2) Дана последовательность целых чисел, оканчивающаяся нулем.
 * Найти сумму положительных чисел, после которых следует отрицательное число.
 * Пример ввода:
 * 1 2 1 2 -1 1 3 1 3 -1 0
 * Логика расчета:
 * 2 -1 переход -> 2 в сумму
 * 3 -1 переход -> 3 в сумму
 * Пример вывода: 5
 */

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int sum = 0;
        do {
            System.out.println("Input number: ");
            value = scanner.nextInt();
            sum = sum + value;
            if (value < 0){
                System.out.println(sum);
                sum = 0;
            }
        } while (value != 0);
        System.out.println("Input 0");
    }
}