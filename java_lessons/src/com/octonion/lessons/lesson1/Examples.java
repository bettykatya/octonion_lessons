package com.octonion.lessons.lesson1;

public class Examples {

    public static void main(String[] args) {

        int[] list = {3, 6, 2, 8, 1, 5, 7};
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (min > list[i]) {
                min = list[i];
            }
        }
        System.out.println("min = " + min);

        int[] listSorted = new int[list.length];
        listSorted[0] = min;


        System.out.println();
        for (int i = 0; i < listSorted.length; i++) {
            System.out.print(listSorted[i] + " ");
        }
    }

    //region leap year
    private static boolean isLeapYear(int year) {
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
            return true;
        else
            return false;
    }
    //endregion

    //region fibonacci
    private static void showFibonacci() {
        int num1 = 0;
        int num2 = 1;
        int result = num1 + num2;

        System.out.println(num1 + " " + num2 + " ");
        while (result < 150) {
            System.out.println(result + " ");
            num1 = num2;
            num2 = result;
            result = num1 + num2;
        }
    }
    //endregion

    //region Transpose a matrix (Транспонировать матрицу)
    private static void transposeMatrix() {
        int[][] fromMatrix =
                {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16},
                        {17, 18, 19, 20}};
        int[][] toMatrix = new int[fromMatrix[0].length][fromMatrix.length];
        for (int i = 0; i < fromMatrix.length; i++) {
            for (int j = 0; j < fromMatrix[0].length; j++) {
                toMatrix[j][i] = fromMatrix[i][j];
            }
        }
        printMatrix(fromMatrix);
        printMatrix(toMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }
    //endregion

}
