package com.company.kshebeko_tic_tac;

public class Main {

    public static void main(String[] args) {
	// Выводи массив от 1 до 9
        int[][] matrix =
                {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int M = matrix.length;
        int N = matrix[0].length;

        System.out.println("Выберете любое число от 1 до 9 и туда поставит Х или 0");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++){
                System.out.print(" " + matrix[i][j] );
            }
            System.out.println();
        }
    }
}
