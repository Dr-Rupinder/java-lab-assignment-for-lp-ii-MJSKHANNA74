/*Write a program that calculates the sum of each row and each column in a 2D matrix and displays the results.*/
package lp2;
import java.util.Scanner;
public class exp4d{
    public static void main(String[] args) {
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
        int size = matrix.length;
        int[] rowSum = new int[size];
        int[] colSum = new int[size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rowSum[i] += matrix[i][j];
                colSum[j] += matrix[i][j];
            }
        }

        System.out.println("Sum of each row:");
        for (int i = 0; i < size; i++) {
            System.out.println("Row " + (i+1) + ": " + rowSum[i]);
        }

        System.out.println("Sum of each column:");
        for (int i = 0; i < size; i++) {
            System.out.println("Column " + (i+1) + ": " + colSum[i]);
        }
    }
}
