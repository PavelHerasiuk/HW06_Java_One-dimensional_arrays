package by.epam.linear_program.main;

import java.util.Random;
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        // 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все
        //    ее члены, большие данного Z, этим числом. Подсчитать количество замен.
        int a;
        int z;
        int counter;
        a = enterNum(" Укажите длинну массива ");
        int[] mas = lengthMas(a);

        randomMasElement(mas);
        printMas(mas);
        z = enterNum(" Укажите число Z ");

        counter = replaceCounter(mas, z);
        print(" Число измененных элементов = ", counter);

        printMas(mas);
    }

    private static int replaceCounter(int[] mas, int z) {
        int counter = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > z) {
                mas[i] = z;
                counter++;
            }
        }
        return counter;
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
            System.out.printf("% 4d ", mas[i]);
        }
        System.out.println();
    }

    public static void print(String message, int a) {
        System.out.println(message + a);
    }
}