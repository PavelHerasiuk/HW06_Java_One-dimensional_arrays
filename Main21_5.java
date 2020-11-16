package by.epam.linear_program.main;

// 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем
//    отрицательных, положительных и нулевых элементов. Сокращенное решение.
public class Main21_5 {
    public static void main(String[] args) {
        int[] mas = new int[]{1, 1, 4, 6, 0, 0, -2, -2,};
        printMas(mas);
        countPositiveNegativeZero(mas);
    }

    private static void countPositiveNegativeZero(int[] mas) {
        int countPositiveNumber = 0;
        int countNegativeNumber = 0;
        int countZeroNumber = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                countPositiveNumber++;
            }
            if (mas[i] < 0) {
                countNegativeNumber++;
            }
            if (mas[i] == 0) {
                countZeroNumber++;
            }
        }
        System.out.println(" В массиве " + countPositiveNumber + " положительных элементов");
        System.out.println(" В массиве " + countNegativeNumber + " отрицательных элементов");
        System.out.println(" В массиве " + countZeroNumber + " нулевых элементов элементов");
    }

    public static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("% 3d ", mas[i]);
        }
        System.out.println();
        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -   ");
    }
}