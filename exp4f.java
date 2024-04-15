/*Write a program that checks whether a given square matrix is a magic square or not. A magic square is a square matrix where the sum of each row, each column, and both diagonals is the same.*/
package lp2;

import java.util.Scanner;

public class exp4f {
    public static void main(String[] args) {
     /*example of magic square matrix int[][] matrix = {
    	            {2, 7, 6},
    	            {9, 5, 1},
    	            {4, 3, 8}
    	        };*/
   	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the size (eg:2x2,3x3) of the matrix:");
	 int n = scanner.nextInt();
     int[][] matrix = new int[3][3];
     System.out.println("Enter the elements of the matrix:");
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
             matrix[i][j] = scanner.nextInt();
         }
     }
     scanner.close();
     System.out.println("The entered matrix is:");
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
             System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
     }
        System.out.println("Is the given matrix a magic square? " + isMagicSquare(matrix));
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int size = matrix.length;
        int magicSum = 0;
        for (int i = 0; i < size; i++) {
            magicSum += matrix[0][i];
        }
        for (int i = 0; i < size; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != magicSum || colSum != magicSum) {
                return false;
            }
        }
        int diagSum1 = 0;
        int diagSum2 = 0;
        for (int i = 0; i < size; i++) {
            diagSum1 += matrix[i][i];
            diagSum2 += matrix[i][size - i - 1];
        }
        if (diagSum1 != magicSum || diagSum2 != magicSum) {
            return false;
        }

        return true;
    }
}

