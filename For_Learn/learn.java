package For_Learn;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class learn {
    public static void main(String[] args) {

    }

    /**
     * Дана последовательность из N целых чисел.
     * Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
     */
    int sumNext5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int number;
        int first = 1;
        int count = 0;
        do {
            number = sc.nextInt();
            if (first % 2 == 0) {
                if (number / 10 == 5) {
                    sum += number;
                }
            }
            System.out.println(first);
            System.out.println(number);
            first = number;
            count++;
        } while (count < n);
        return sum;
    }

    void mas() {
        int[] mas = {1, 2, 3};
        int[][] mass = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.println(mass[i][j] + "");
            }
            System.out.println();

        }
    }

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * <p>
     * Example 1:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * <p>
     * Example 2
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * <p>
     * Example 3:
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     */
    static void sumnumb(int numb) {
        int[] arr = {3, 2, 4};
        int sum = 0;
        int[] new_arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == numb) {
                    new_arr[0] = i;
                    new_arr[1] = j;
                }
            }
        }
        System.out.println(new_arr[0]);
        System.out.println(new_arr[1]);
    }

    /**
     * написать метод для нахождения простых чисел методом исключения
     */
    static void findSimpleNumber() {
        List<Integer> arrList = new ArrayList<>();
        List<Integer> arrListNew = new ArrayList<>();
        for (int i = 2; i < 9999; i++) {
            if (i % 2 == 0) {
                arrList.add(i);
            }
            if (i % 3 == 0) {
                arrList.add(i);
            }
            if (i % 5 == 0) {
                arrList.add(i);
            }
            if (i % 7 == 0) {
                arrList.add(i);
            }
        }


        for (int i = 2; i < 9999; i++) {
            arrListNew.add(i);
        }

        arrListNew.removeAll(arrList);
        System.out.println(arrListNew);

    }

    /**
     * findSimple поиск простых чисел через массив булин
     */
    static void findSimple() {
        Integer limit = 200;

        boolean[] primes = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++)
            primes[i] = true;

        for (int p = 2; p * p <= limit; p++) {
            if (primes[p] == true) {
                System.out.println(p);
                for (int i = p * p; i <= limit; i += p) {
                    primes[i] = false;
                }
            }
        }
        System.out.print("Prime numbers up to " + limit + ": ");
        for (int i = 2; i <= limit; i++) {
            if (primes[i] == true)
                System.out.print(i + " ");
        }
    }


    static void reversArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of space-separated values: ");
        String input = scanner.nextLine();

        List<String> list = new LinkedList<>(Arrays.asList(input.split(" ")));
        ListIterator<String> itr = list.listIterator(list.size());

        System.out.print("Reversed List: ");
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }
    }

    /**
     * @param number факториал числа
     * @return через рекурсию
     */
    static int recursion(int number) {
        System.out.println(number);
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * recursion(number - 1);
    }

    /**
     *
     * @param number степень числа num
     * @return
     */
    static int recursionNum(int number){
        int num = 2;
        if (number == 1){
            return num;
        }
        return num * recursionNum(number-1);
    }
}
