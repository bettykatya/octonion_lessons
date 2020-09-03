package com.company;

public class Main {

    public static void main(String[] args) {
        // Определить возможность существования треугольника по сторонам
        //Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
        //Дано: a, b, c – стороны предполагаемого треугольника.
/*
        int a = 67, b = 4, c = 4;
        if (a + b > c & a + c > b & b + c > a) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
*/
        //Возведение числа в степень
        //Дано: n - число, d - степень
/*
        int n = 4;
        int b = 5;
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res = res * n;
            System.out.println("Возведение числа в степень равно = " + res);
        }
*/
        // Вывести делители числа
        //Для натурального числа n вывести все делители, кроме единицы и самого числа.
        /*
        int n = 90;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Целое число:" + i);
            }
        }
 */
        //Сумма положительных элементов массива
        //Найти сумму положительных элементов массива.
        /*
        int[] arr = {9, -6, 3, 5, -6, 7, 9};
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum + arr[i]; // 9
                System.out.println("Сумма = " + sum);
            }
        }
*/
//Вывести элементы массива, которые больше среднего арифметического
//Дан одномерный массив. Найти среднее арифметическое его элементов. Вывести на экран только те элементы массива, которые больше найденного среднего арифметического.
       /*
        int[] arr = {5, 4, 8, 0, 9, 4, 1, 3};
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        int arith;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма = " + sum);
        arith = sum / arr.length;
        System.out.println("Сред ариф = " + arith);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arith) {
                System.out.println("Элеиенты массива больше сред. ариф :" + arr[i]);
            }
        }
*/
        //Есть ли в массиве одинаковые элементы
        //Дан массив целых чисел. Проверить, есть ли в нем одинаковые элементы.
        /*
        int[] arr = {6, 9, 6, 6, 8, 8, 7};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Одинаковые элементы: " + arr[i]); // 9; 6;8
                }
            }
        }
*/
        //Сортировка выбором
        //Требуется отсортировать массив по возрастанию. (используя поиск максимального ИЛИ минимального элемента)
/*
        int[] arr = {4, 7, 9, -10, 15, 7, 0, 4, 3};
        for (int i = 0; i < arr.length; i++) {
            int imin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[imin]) {
                    imin = j;
                }
            }
            System.out.println("Минимальный элемент:" + imin);
            int tmp = arr[imin];
            arr[imin] = arr[i];
            arr[i] = tmp;
            System.out.println(Arrays.toString(arr));
        }
*/
        //Комбинации из трех чисел, дающие в сумме заданное число
        //Написать программу, которая находит все комбинации из трех чисел до определенного предела, которые в сумме дают другое число.
        //Пример:
        //Дано: Предел для перебираемых чисел: 5, Искомая сумма: 10
        //1 4 5, 1 5 4, 2 3 5, ...
        /*
        //Комбинации из трех чисел, дающие в сумме заданное число
        //Написать программу, которая находит все комбинации из трех чисел до определенного предела, которые в сумме дают другое число.
        //Пример:
        //Дано: Предел для перебираемых чисел: 5, Искомая сумма: 10
        //1 4 5, 1 5 4, 2 3 5, ...
/*
        int sum = 10;
        int pre = 5;
        int a;
        int b;
        int c;
        for (int i = 1; i <= pre; i++) {
            for (int j = 1; j <= pre; j++) {
                for (int k = 1; k <= pre; k++) {
                    if (sum == i + j + k) {
                        System.out.println(" Числа: " + i + " и " + j + " и " + k);
                    }
                }
            }
        }
         */
        //1.4.1. Максимальные элементы столбцов матрицы
        /*int[][] matrix =
                {{1, 6, 7, 4},
                 {-3, 5, 8, 2},
                 {4, 7, -3, 0},
                 {0, 2, 1, -1}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < matrix.length; j++) {
            int max = matrix[0][j];
            for (int i = 0; i < matrix[j].length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println("Масксимальное число: " + max);
        }*/
        //*Количество отрицательных элементов под главной диагональю матрицы
        int[][] matrix =
                {{4, 6, 6, 2},
                        {-3, 5, -4, 7},
                        {5, 6, 2, 1},
                        {9, 9, -8, 7}};
        int M = matrix.length;
        int N = matrix[0].length;
        int count = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] < 0) {
                    count += 1;
                }
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Количество минимальных эементов: " + count);

    }
}
