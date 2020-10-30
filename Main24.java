package by.epam.linear_program.main;

public class Main24 {
    public static void main(String[] args) {
        //6. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
        // порядковые номера которых являются простыми числами.

        double[] mas1 = new double[]{1, 3, 5, 35.0, 7, 88, 99};
        double sum = 0;

        for (int i = 2; i < mas1.length; i++) {
            if ((i == 2) || (i % 2 != 0)) {
                sum = sum + mas1[i];
                System.out.print(mas1[i] + "   ");
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}