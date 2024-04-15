/*Write a program that takes a student&#39;s score as input and prints out their corresponding
grade based on the following scale:
90-100: A
80-89: B
70-79: C
60-69: D
Below 60: F
Implement the same with if elseif else and switch-case statements.*/
package lp2;
import java.util.Scanner;
public class exp3a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student's score: ");
        int score = scanner.nextInt();
        System.out.println("Grade using if elseif else statements : ");
        // Using if-else statements
        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score < 70) {
            System.out.println("Grade: D");
        } else if (score < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid score");
        }
        System.out.println("Grade using switch-case statements : ");
        // Using switch-case statements
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }
    }
}
