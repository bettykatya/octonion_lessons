package com.octonion.lesson1;

public class AlenaHW1 {
    public static class AlenaLesson1Answers {
        public static void main(String[] args) {

            arrayAverage();

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
            int average = summ / array.length;
            for (int i = 0; i < array.length; i++) {
                summ += array[i];
                if (i > average) {
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

    }
}


