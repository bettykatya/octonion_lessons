package com.octonion.lesson1.cycles;

public class Cycles {

    public static void main(String[] args) {
        combinations();
    }

    //region exponentiation (возведение числа в степень)
    /*
Циклы
2. Возведение числа в степень
Дано: n - число, d - степень
 */
    private static void exponentiation() {

        int n = 2; // число
        int d = 8; // степень
        int res = n;

        for (int i = 0; i < d - 1; i++) { // степень - 1, т.к. получится больше чем в степени 8
            res *= n;                         // присвоение с умножением

            System.out.println(res);
        }
    }
    //endregion

    //region combinations (комбинация из трёх чисел)

        /*
Циклы
3. Комбинации из трех чисел, дающие в сумме заданное число
Написать программу, которая находит все комбинации из трех чисел до определенного предела, которые в сумме дают другое число.
Пример:
Дано: Предел для перебираемых чисел: 5, Искомая сумма: 10
1 4 5, 1 5 4, 2 3 5, ...
*/

    private static void combinations() {
        int res;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                for (int k = 0; k <= 5; k++) {
                    res = i + j + k;
                    if (res == 10) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
//endregion combinations

    //region divisors (делители числа)
/*
Циклы
4. Вывести делители числа
Для натурального числа n вывести все делители, кроме единицы и самого числа.
*/
    private static void divisors() {
        int n = 28;
        int res;

        for (int i = 1; i < n + 1; i++) {
            res = n % i;                            // остаток от деления по модулю
            if ((res == 0) & (i != n) & (i != 1)) { //если res равно 0 и i не равно само себе и не равно 1

                System.out.println(i + " ");
            }
        }
    }
    //endregion
}
