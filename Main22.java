package by.epam.linear_program.main;

import java.util.Random;
import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        // 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
        // наименьший элементы.

        int a;
        a = enterNum("Укажите длинну массива");

        int[] mas = lengthMas(a);

        randomMasElement(mas);
        printMas(mas);

        sort(mas);
        printMas(mas);

        replaceMinMax(mas);
        printMas(mas);
    }

    private static void replaceMinMax(int[] mas) {
        int min;

        min = mas[0];
        mas[0] = mas[mas.length - 1];
        mas[mas.length - 1] = min;
    }

    private static void sort(int[] mas) {
        int indexMinElement = 0;

        for (int i = 0; i < mas.length; i++) {
            indexMinElement = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[indexMinElement] > mas[j]) {
                    indexMinElement = j;
                }
            }
            int temp = mas[indexMinElement];
            mas[indexMinElement] = mas[i];
            mas[i] = temp;
        }
    }

    private static int enterNum(String mesage) {
        int value;

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println(mesage);

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println(mesage);
        }
        value = scan.nextInt();
        return value;
    }

    private static int[] lengthMas(int a) {
        return new int[a];
    }

    private static void randomMasElement(int[] mas) {
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
        System.out.println("--------->");
    }

    public static void print(String message, int a) {
        System.out.println(message + a);
    }
}