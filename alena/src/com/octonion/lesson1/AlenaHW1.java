package com.octonion.lesson1;

public class AlenaHW1 {
    public static class AlenaLesson1Answers {
        public static void main(String[] args) {

            distance();
        }

        //region triangle
        /*
        Определить возможность существования треугольника по сторонам
    Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
    Дано: a, b, c – стороны предполагаемого треугольника.
         */
        private static void showTriangle() {
            int a = 2;
            int b = 4;
            int c = 8;
            if ((a + b > c) & (a + c > b) & (c + b > a)) {
                System.out.println("это треугольник");
            } else {
                System.out.println("это не треугольник");
            }
        }

        //endregion

        //region degree of number
    /*
    Возведение числа в степень
Дано: n - число, d - степень
     */
        private static void degree() {
            int number = 4;
            int degree = 5;
            int result = number;
            for (int i = 0; i < degree - 1; i++) {
                result *= number;
            }
            System.out.println(result);
        }
        //endregion

        //region Combo
    /*
    Комбинации из трех чисел, дающие в сумме заданное число
Написать программу, которая находит все комбинации из трех чисел до определенного предела, которые в сумме дают другое число.
Пример:
Дано: Предел для перебираемых чисел: 5, Искомая сумма: 10
1 4 5, 1 5 4, 2 3 5, ...
     */
        private static void combinations() {

            int limit = 5;
            int summ = 10;
            for (int i = 1; i <= limit; i++) {
                for (int j = 1; j <= limit; j++) {
                    for (int k = 1; k <= limit; k++) {
                        if (summ == i + j + k) {
                            System.out.println(i + " " + j + " " + k);
                        }
                    }
                }
            }
        }
//endregion

        //region deliteli natur number
    /*
    *Вывести делители числа
Для натурального числа n вывести все делители, кроме единицы и самого числа.
     */
        private static void deliteli() {
            int n = 6;
            int res;
            for (int i = 2; i < n; i++) {
                res = n % i;
                if (res == 0) {
                    System.out.println(" " + i);
                }
            }
        }
        //endregion

        //region arrayPositiveSumm
    /*
    Сумма положительных элементов массива
Найти сумму положительных элементов массива.
     */
        private static void arrayPositiveSumm() {
            int[] array = {5, 10, -3, 4};
            int summ = 0;
            for (int i = 0; i < array.length; i++) {
                if ((array[i] > 0)) {
                    System.out.print(" Number " + array[i] + ",");
                    summ += array[i];
                    System.out.println("Summ = " + summ);
                }
            }
        }
//endregion


        //region array average of elements NOT DONE
        /*Вывести элементы массива, которые больше среднего арифметического
Дан одномерный массив. Найти среднее арифметическое его элементов. Вывести на экран только те элементы массива, которые больше найденного среднего арифметического.
*/
        private static void arrayAverage() {
            int[] array = {2, 12, 4, 2};
            int summ = 0;
            int average;
            // int  iMax= 0;
            for (int i = 0; i < array.length; i++) {
                summ += array[i];
                average = 20 / array.length;
                //  System.out.println("сумм" + summ);
                if (array[i] > average) {
                    System.out.println(array[i]);
                }

            }
        }
        //endregion

        //region duplicates NOT DONE
        /*
        Есть ли в массиве одинаковые элементы
Дан массив целых чисел. Проверить, есть ли в нем одинаковые элементы.
         */
        private static void duplicates() {
            int[] array = {4, 8, 5, 5};
            int x = 0;
            for (int i = 0; i < array.length; i++) {

                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) ;
                    System.out.println(array[i]);

                }
            }
        }
        //endregion

        //region Distance between dots NOT DONE
        /*
        1.3.4 Расстояние между точками в n-мерном пространстве
При заданных координатах A1, A2, ..., An одной точки и координатах B1, B2, ..., Bn другой точки n-мерного пространства.
Найти расстояние между ними по формуле sqrt(sqr(A1-B1) + ... + sqr(An-Bn)).
         */
        private static void distance() {
            int[] line1 = {1, 2, 3};
            int[] line2 = {4, 5, 6};
            int res;
            for (int i = 0; i < line1.length; i++) {
          res = (line2[i] - line1[i]) * (line2[i] - line1[i]) ;
                System.out.print(res);

            }

        }


        //endregion

        //region что будет выведено
        private static void ex1() {
            int[][] matrix1 = {{5, 3, 7, 0},
                    {7, 1, 9, 2},
                    {3, 4, 7, 6}};
            int[][] matrix2 = {{4, 8},
                    {3, 6},
                    {0, 3},
                    {5, 2}};
            int[][] matrix3 = new int[3][2];

            for (int i = 0; i < matrix1.length; i++) { //i=0-3
                for (int j = 0; j < matrix2[0].length; j++) { //j=0-2
                    matrix3[i][j] = 0;
                    for (int k = 0; k < matrix2.length; k++) { //k 0-4
                        matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            //   printMatrix(matrix1);
            //  printMatrix(matrix2);
            //   printMatrix(matrix3);
        }
/*
        i = 0;
        j = 0;

        k=0; m[0][0] = 0+ 5*4 = 20
        k=1; m[0][0] = 20 + 3*3 = 29;
        k=2: m[0][0] = 29 + 7*0 = 29
        k=3: m[0][0] = 29 + 0*5 = 29

        i = 0;
        j = 1
        k=0; m[0][1] = 0+5*8  = 40
        k=1; m[0][1] = 40+3*6  = 58
        k=2; m[0][1] = 58+7*3   = 79
        k=3; m[0][1] = 79+0*5=79

        i = 1;
        j = 0
        k=0; m[1][0] = 0+7*4=28
        k=1; m[1][0] = 28+3*6=46
        k=2; m[1][0] =46+7*0=46
        k=3; m[1][0] =46+2*5=56

        i = 2;
        j = 0
        k=0; m[2][0] = 0+3*4=12
        k=1; m[2][0] =12+4*3=24
        k=2; m[2][0] =24+7*0=24
        k=3; m[2][0] =24+6*5=54

matrix3 =
{20,40,28 ,12 }
{29,58,46 ,24 }
{29,79,46 ,24 }
{29,79,56 ,54 }
*/
        //endregion

    }
}


