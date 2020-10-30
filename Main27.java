package by.epam.linear_program.main;

import java.util.Random;

public class Main27 {
    public static void main(String[] args) {
        // 9. В массиве целых чисел с количеством элементов n найти наиболее часто
        // встречающееся число. Если таких чисел несколько, то определить наименьшее из них.

        int[] mas1 = new int[20];

        randomValue(mas1);
        printMas(mas1);
        findNum(mas1);
    }

    private static void findNum(int[] mas1) {
        int element = 0;
        int maxElement = 0;

        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1.length; j++) {
                if ((i != j) && (mas1[i] == mas1[j])) {
                    element++;
                }
                if (element > maxElement) {
                    maxElement = element;
                    element = mas1[i];

                } else if (element == maxElement) {
                    maxElement = element;
                    if (element > mas1[i]) {
                        element = mas1[i];
                    }
                }
            }
            element = 0;
        }
        System.out.println(" Наиболее часто встречающееся число " + maxElement);
    }

    public static void randomValue(int[] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(100);
        }
    }

    public static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("% 3d ", mas[i]);
        }
        System.out.println();
    }
}