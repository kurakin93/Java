package java_familiarity_intro.HW2;

import java_familiarity_intro.HW2.model.Vector;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.7, 5.4, 3.3);
        Vector vector2 = new Vector(3.2, 1.5, 2.7);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("Длинна вектора: " + vector1.lenghtvector());
        System.out.println("Длинна вектора: " + vector2.lenghtvector());
        System.out.println(("Скалярное произведение: " + vector1.scalarMulti(vector2)));
        System.out.println("Векторное произведение с другим вектором: " + vector1.vectorMulti(vector2));
        System.out.println("Косинус угла: " + vector1.cosVector(vector2));
        System.out.println("Разность векторов: " + vector1.difVector(vector2));
        System.out.println("Сумма векторов: " + vector1.sumVector(vector2));
        System.out.println("Сумма простых чисел: " + sumNext5());
        System.out.println(trueFalse());
        int[] numArr = replaceDoubleArrWithNegatElem();
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);

        }
    }

    /**
     * Дана последовательность N целых чисел. Найти сумму простых чисел.
     */
    public static int sumNext5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number;
        int sum = 0;
        int count;
        for (int i = 0; i < n; i++) {
            number = sc.nextInt();
            count = 0;
            for (int j = 2; j < number + 1; j++) {
                if (number % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                sum += number;
                System.out.println("Число простое!");
            } else {
                System.out.println("Не простое");
            }
        }
        return sum;
    }

    /**
     * Дана последовательность из N целых чисел.
     * Верно ли, что последовательность является возрастающей.
     */
    public static boolean trueFalse() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number;
        int first = 0;
        for (int i = 0; i < n; i++) {
            number = sc.nextInt();
            if ((number - first) > 0) {
                first = number;
            } else return false;
        }
        return true;
    }

    /**
     * Дан массив целых чисел.
     * Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     */
    public static int[] replaceDoubleArrWithNegatElem() {
        int sum = 0;
        int[] arr = {1, -1, 5, 50, -3, 77};
        for (int i = 0; i < arr.length; i++) {
            if (10 < arr[i] && arr[i] < 99) {
                sum += i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                arr[i]=sum;
            }
        }
        return arr;
    }
}


