package by.epam.linear_program.main;

import java.util.Random;
// 9. В массиве целых чисел с количеством элементов n найти наиболее часто
// встречающееся число. Если таких чисел несколько, то определить наименьшее из них.
public class Main27_1 {
    public static void main(String[] args) {
        int[] mas = new int[25];
        int[] indexes = new int[25];
        randomValue(mas);
        printMas(mas);
        System.out.print(findMostCommonNumber(mas, indexes));
    }

    public static void randomValue(int[] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(10);
        }
    }

    private static int numberOfOccurrences(int[] mas, int index, int[] indexes, int index2) {
        int number = 1;
        int i;
        indexes[index2] = index;
        index2 = index2 + 1;
        for (i = index + 1; i < mas.length; i++) {
            if (mas[i] == mas[index]) {
                number = number + 1;
                indexes[index2] = i;
                index2 = index2 + 1;
            }
        }
        return number;
    }

    private static int findMostCommonNumber(int[] mas, int[] indexes) {
        int i;
        int k;
        int j = 0;
        int q;
        int qmax;
        int min;
        boolean flag = true;
        qmax = numberOfOccurrences(mas, 0, indexes, j);
        min = mas[0];
        j = j + qmax;
        for (i = 1; i < mas.length; i++) {
            for (k = 0; k < j; k++) {
                if (i == indexes[k]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                q = numberOfOccurrences(mas, i, indexes, j);
                if (q > qmax) {
                    qmax = q;
                    min = mas[i];
                }
                if (q == qmax) {
                    if (mas[i] < min) {
                        min = mas[i];
                    }
                }
                j = j + q;
            }
            flag = true;
        }
        return min;
    }

    public static void printMas(int[] mas) {
        for (int ma : mas) {
            System.out.printf("% 3d", ma);
        }
        System.out.println("\n" + "Наиболее часто встречающееся наименьшее число в массиве: ");
    }
}