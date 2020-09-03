package com.octonion.lesson1.arrays;

public class Arrays {


    public static void main(String[] args) {
        arraySimilarValues();
    }

    //region arrayPositiveSum (сумма положительных элементов массива)
    /*
    Циклы
    5. Сумма положительных элементов массива
    Найти сумму положительных элементов массива.
*/

    private static void arrayPositiveSum() {

        int[] arr = {3, 5, 9, 11, 114};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print("num " + arr[i] + ",");
                sum += arr[i];
                System.out.println("sum = " + sum);
            }
        }
    }
    //endregion

    //region arrayGraterAverage (элементы которые больше среднего арифмитического)
    /*
    6. Вывести элементы массива, которые больше среднего арифметического
    Дан одномерный массив. Найти среднее арифметическое его элементов.
    Вывести на экран только те элементы массива, которые больше найденного среднего арифметического.
     */


    private static void arrayGraterAverage() {

        int[] arr = {3, 5, 9, 8, 10, 2, 1};
        int sum = 0;
        int avg;
        System.out.println(java.util.Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.println("sum = " + sum);
            avg = sum / arr.length;
            System.out.println("avg of the amount = " + avg);
            if (arr[i] > avg) ;
            System.out.println("element that is greater then avg = " + arr[i]);
        }

    }
    //endregion

    //region arraySimilarValues (повторяющиеся элементы)
    /*
    7.Есть ли в массиве одинаковые элементы
    Дан массив целых чисел. Проверить, есть ли в нем одинаковые элементы.
     */

    private static void arraySimilarValues() {

        int[] arr = {3, 5, 8, 8, 10, 3, -8};
        System.out.println(java.util.Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("the array contains the same elements = " + arr[i]);
                }
            }
        }
    }
    //endregion


    //region ===EMPTY=== arrayDistanceBtwPoints
/*
8. Расстояние между точками в n-мерном пространстве
При заданных координатах A1, A2, ..., An одной точки и координатах B1, B2, ..., Bn другой точки n-мерного пространства.
Найти расстояние между ними по формуле sqrt(sqr(A1-B1) + ... + sqr(An-Bn)).




 */

    //endregion N

    //region ===NOT ENDED=== arraySelectionSort
/*
9. *Сортировка выбором
Требуется отсортировать массив по возрастанию. (используя поиск максимального ИЛИ минимального элемента)
 */
    private static void arraySelectionSort() {
        int[] arr = {1, 7, 5, 2, 4, 6, 3};
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            //System.out.println(min);  // сортировка по возростанию
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }
            System.out.println(min);
        }

    }
//endregion

}
