package by.epam.linear_program.main;

public class Main19 {
    public static void main(String[] args) {
        // 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
        // которые кратны данному К.

        int N = rand();
        int K = rand();
        int[] mas = ar(N);

        System.out.println(" Длина массива: " + N);
        System.out.println(" Сумма чисел кратных " + K + " : " + sum(mas, K));
    }

    public static int rand() {
        return (int) (Math.random() * 10);
    }

    private static int[] ar(int a) {
        int[] mas = new int[a];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand();
        }
        return mas;
    }

    public static int sum(int[] mas, int b) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % b == 0) {
                sum = sum + mas[i];
            }
        }
        return sum;
    }
}