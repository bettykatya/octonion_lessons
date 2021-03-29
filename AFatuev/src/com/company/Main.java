package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] matrixB = {
                {-9,1,0},
                {4,1,1},
                {-2,2,-1},
                {9,7,6}
        };

        int[][] matrixT;
        matrixT = new int[matrixB[0].length][matrixB.length];
        transpar(matrixB,matrixT);
        output(matrixT);

/*        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a=in.nextInt();
        System.out.println("Введите второе число:");
        int b=in.nextInt();

        sum(a,b);
        multiply(a,b);
        division(a,b);
        subtraction(a,b);*/
    }


    public static void transpar (int[][] input,int[][] output){

        for (int i=0; i < input.length; i++){
            for (int j=0; j < input[i].length; j++){
                 output [j][i] = input [i][j];
            }
        }
    }


    public static void output(int[][] matrixA) {
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int sum( int x,int y){
        int sum=x+y;
        System.out.println("Сумма "+ sum);
        return  sum;
    }
    public static int multiply( int x,int y){
        int composition=x*y;
        System.out.println("произвдение "+composition);
        return  composition;
    }
    public static int division( int x,int y){
        int quotient=x/y;
        System.out.println("Частное "+quotient);
        return  quotient;
    }
    public static int subtraction( int x,int y){
        int difference=x-y;
        System.out.println("Разность "+difference);
        return  difference;
    }
}