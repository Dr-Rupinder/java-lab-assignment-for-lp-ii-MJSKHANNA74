/*Write a Java program to print Pascal's Triangle of n rows.Use nested loops to calculate the values.*/
package lp2;
public class exp1b {
    public static void main(String[] args) {
        int n = 5; // number of rows
        for(int i = 0; i < n; i++) {
            int number = 1;
            for(int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

