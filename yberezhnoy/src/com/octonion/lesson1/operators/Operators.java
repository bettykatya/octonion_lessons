package com.octonion.lesson1.operators;

public class Operators {

    public static void main (String[] args) {
        triangle();
    }
    //region triangle (определение существования треугольника)
/*
Условные операторы.
1. Определить возможность существования треугольника по сторонам
Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Дано: a, b, c – стороны предполагаемого треугольника.
 */
        private static void triangle(){

        int a = 9;
        int b = 5;
        int c = 3;

        if ((a + b > c) && (b + c > a) && (a + c > b)){   // укороченное И
            System.out.println("треугольник существует");}
        else {
            System.out.println("треугольника не существует");
        }
    }
    //endregion
}

