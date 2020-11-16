package by.epam.linear_program.main;

import java.util.Arrays;
import java.util.Random;

// 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
// наименьший элементы. Данное решение меняет любое количество min на mаx. Проверил.
public class Main22_3 {
    public static void main(String[] args) {
        init(20);
    }

    private static void init(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        for (int k : array) {
            if (k > max) {
                max = k;
            }
        }
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = min;
            } else if (array[i] == min) {
                array[i] = max;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Replace elements: " + max + " on " + min);
    }
}