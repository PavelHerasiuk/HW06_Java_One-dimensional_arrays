package by.epam.linear_program.main;

import java.util.Random;
import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        // 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
        // которых аi > i
        int a;
        a = enterNum(" Укажите длинну массива ");

        int[] mas = lengthMas(a);

        randomMasElement(mas);
        printMas(mas);
        printAi(mas);
    }

    private static void printAi(int[] mas) {
        int temp;
        for (int i = 0; i < mas.length; i++) {
            if (i > mas[i]) {
                temp = mas[i];
                System.out.printf("% 2d ", temp);
            }
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
            mas[i] = rand.nextInt(15);
        }
    }

    public static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("% 2d ", mas[i]);
        }
        System.out.println();
        System.out.println("----------");
    }

    public static void print(String message, int a) {
        System.out.println(message + a);
    }
}