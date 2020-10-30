package by.epam.linear_program.main;

public class Main21 {
    public static void main(String[] args) {
        // 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем
        //    отрицательных, положительных и нулевых элементов.

        int[] mas = new int[]{34, 85, 1, 0, -8, 7, -2, 0, 92, -31};

        printMas(mas);
        counterPositiveNumber(mas);
        counterNegativeNumber(mas);
        counterZero(mas);
    }

    private static int counterZero(int[] mas) {
        int counter = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                counter++;
            }
        }
        System.out.println(" В массиве " + counter + " нулевых элементов ");
        return counter;
    }

    private static int counterNegativeNumber(int[] mas) {
        int counter = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                counter++;
            }
        }
        System.out.println(" В массиве " + counter + " отрицательных элементов ");
        return counter;
    }

    private static int counterPositiveNumber(int[] mas) {
        int counter = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                counter++;
            }
        }
        System.out.println(" В массиве " + counter + " положительных элементов ");
        return counter;
    }

    public static void printMas(int[] mas) {
        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  ");
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("% 3d ", mas[i]);
        }
        System.out.println();
        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -   ");
    }
}