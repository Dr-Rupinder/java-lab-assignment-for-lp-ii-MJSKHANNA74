
Ans 1.1: public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 using for loop:");
        printPrimesWithForLoop();

        System.out.println("\nPrime numbers between 1 and 100 using while loop:");
        printPrimesWithWhileLoop();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print prime numbers between 1 and 100 using for loop
    public static void printPrimesWithForLoop() {
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to print prime numbers between 1 and 100 using while loop
    public static void printPrimesWithWhileLoop() {
        int num = 1;
        while (num <= 100) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}


Ans 1.2:public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 5; // Change this value to adjust the number of rows in the triangle
        printPascalsTriangle(rows);
    }

    public static void printPascalsTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}



Ans 1.3:public class Factorial {
    public static void main(String[] args) {
        int n = 10; // Change this value to calculate factorial of different numbers
        long startTime = System.nanoTime();
        long factorialResult = factorial(n);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Factorial of " + n + " is: " + factorialResult);
        System.out.println("Time taken for recursion: " + duration + " nanoseconds");
        
        // Loop-based factorial calculation for comparison
        startTime = System.nanoTime();
        factorialResult = factorialLoop(n);
        endTime = System.nanoTime();
        duration = (endTime - startTime);

        System.out.println("Factorial of " + n + " using loop: " + factorialResult);
        System.out.println("Time taken for loop: " + duration + " nanoseconds");
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static long factorialLoop(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}



Ans 1.4:import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Prime factors of " + number + " are:");
        printPrimeFactors(number);
    }

    public static void printPrimeFactors(int n) {
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // n must be odd at this point. So we can skip one element (i = i + 2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // If n is a prime number greater than 2
        if (n > 2) {
            System.out.print(n);
        }
    }
}



Ans 2.1:public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            return;
        }

        double operand1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double operand2 = Double.parseDouble(args[2]);

        double result = 0;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}



Ans 2.2: import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java PasswordGenerator <length> <character sets>");
            System.out.println("Character sets: u - uppercase letters, l - lowercase letters, n - numbers, s - special characters");
            return;
        }

        int length = Integer.parseInt(args[0]);
        String charSets = args[1];

        String password = generatePassword(length, charSets);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length, String charSets) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        // Define character sets
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String numberChars = "0123456789";
        String specialChars = "!@#$%^&*()_-+=<>?";

        // Build the character set based on user input
        StringBuilder allChars = new StringBuilder();
        if (charSets.contains("u")) {
            allChars.append(uppercaseChars);
        }
        if (charSets.contains("l")) {
            allChars.append(lowercaseChars);
        }
        if (charSets.contains("n")) {
            allChars.append(numberChars);
        }
        if (charSets.contains("s")) {
            allChars.append(specialChars);
        }

        // Generate the password
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        return password.toString();
    }
}



Ans 3.1:import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's score: ");
        int score = scanner.nextInt();
        
        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}



Ans 3.2:import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of the sides of the triangle:");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if (isEquilateral(side1, side2, side3)) {
            System.out.println("The triangle is an equilateral triangle.");
        } else if (isIsosceles(side1, side2, side3)) {
            System.out.println("The triangle is an isosceles triangle.");
        } else {
            System.out.println("The triangle is a scalene triangle.");
        }
    }

    public static boolean isEquilateral(int side1, int side2, int side3) {
        return side1 == side2 && side2 == side3;
    }

    public static boolean isIsosceles(int side1, int side2, int side3) {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }
}



Ans 3.3:import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        
        System.out.print("Enter the source currency (e.g., USD): ");
        String sourceCurrency = scanner.nextLine().toUpperCase();
        
        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        double convertedAmount;

        switch (sourceCurrency) {
            case "USD":
                convertedAmount = convertFromUSD(amount, targetCurrency);
                break;
            case "EUR":
                convertedAmount = convertFromEUR(amount, targetCurrency);
                break;
            // Add cases for other currencies as needed
            default:
                System.out.println("Unsupported source currency.");
                return;
        }

        System.out.printf("%.2f %s is %.2f %s\n", amount, sourceCurrency, convertedAmount, targetCurrency);
    }

    public static double convertFromUSD(double amount, String targetCurrency) {
        switch (targetCurrency) {
            case "EUR":
                return amount * 0.84;
            // Add cases for other currencies as needed
            default:
                System.out.println("Unsupported target currency.");
                return 0.0;
        }
    }

    public static double convertFromEUR(double amount, String targetCurrency) {
        switch (targetCurrency) {
            case "USD":
                return amount * 1.19;
            // Add cases for other currencies as needed
            default:
                System.out.println("Unsupported target currency.");
                return 0.0;
        }
    }

    // Add additional conversion methods for other source currencies if needed
}



Ans 4.1:import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotateBy = 2;
        boolean rotateLeft = true;

        System.out.println("Original array: " + Arrays.toString(arr));

        if (rotateLeft) {
            rotateLeft(arr, rotateBy);
            System.out.println("Array rotated left by " + rotateBy + " positions: " + Arrays.toString(arr));
        } else {
            rotateRight(arr, rotateBy);
            System.out.println("Array rotated right by " + rotateBy + " positions: " + Arrays.toString(arr));
        }
    }

    public static void rotateLeft(int[] arr, int rotateBy) {
        int n = arr.length;
        reverse(arr, 0, rotateBy - 1);
        reverse(arr, rotateBy, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void rotateRight(int[] arr, int rotateBy) {
        int n = arr.length;
        reverse(arr, 0, n - rotateBy - 1);
        reverse(arr, n - rotateBy, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}



Ans 4.2:import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9};
        
        System.out.println("Original array: " + Arrays.toString(arr));

        int[] uniqueArr = removeDuplicates(arr);
        
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int num : arr) {
            if (!set.contains(num)) {
                uniqueList.add(num);
                set.add(num);
            }
        }

        // Convert ArrayList to array
        int[] uniqueArr = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArr[i] = uniqueList.get(i);
        }

        return uniqueArr;
    }
}


Ans 4.3:import java.util.Arrays;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] rotatedMatrix = rotateMatrix(matrix);

        System.out.println("\nMatrix after 90 degree clockwise rotation:");
        printMatrix(rotatedMatrix);
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] rotatedMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}



Ans 4.4:import java.util.Arrays;

public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[] rowSums = calculateRowSums(matrix);
        int[] columnSums = calculateColumnSums(matrix);

        System.out.println("\nSum of each row:");
        System.out.println(Arrays.toString(rowSums));

        System.out.println("\nSum of each column:");
        System.out.println(Arrays.toString(columnSums));
    }

    public static int[] calculateRowSums(int[][] matrix) {
        int numRows = matrix.length;
        int[] rowSums = new int[numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rowSums[i] += matrix[i][j];
            }
        }

        return rowSums;
    }

    public static int[] calculateColumnSums(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[] columnSums = new int[numCols];

        for (int j = 0; j < numCols; j++) {
            for (int i = 0; i < numRows; i++) {
                columnSums[j] += matrix[i][j];
            }
        }

        return columnSums;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}



Ans 4.5:public class IslandCounter {
    public static void main(String[] args) {
        int[][] map = {
            {1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1}
        };

        System.out.println("Number of islands: " + countIslands(map));
    }

    public static int countIslands(int[][] map) {
        int rows = map.length;
        if (rows == 0) {
            return 0;
        }
        int cols = map[0].length;

        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (map[i][j] == 1) {
                    count++;
                    markIsland(map, i, j);
                }
            }
        }
        return count;
    }

    public static void markIsland(int[][] map, int i, int j) {
        int rows = map.length;
        int cols = map[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || map[i][j] == 0) {
            return;
        }

        map[i][j] = 0; // Mark the current cell as visited

        // Visit adjacent cells
        markIsland(map, i + 1, j); // Down
        markIsland(map, i - 1, j); // Up
        markIsland(map, i, j + 1); // Right
        markIsland(map, i, j - 1); // Left
    }
}



Ans 4.6:public class MagicSquareChecker {
    public static void main(String[] args) {
        int[][] square = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        System.out.println("Is the given matrix a magic square? " + isMagicSquare(square));
    }

    public static boolean isMagicSquare(int[][] square) {
        int n = square.length;
        int magicNumber = n * (n * n + 1) / 2;

        // Check rows
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += square[i][j];
            }
            if (rowSum != magicNumber) {
                return false;
            }
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += square[i][j];
            }
            if (colSum != magicNumber) {
                return false;
            }
        }

        // Check main diagonal
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += square[i][i];
        }
        if (diagonalSum != magicNumber) {
            return false;
        }

        // Check secondary diagonal
        diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += square[i][n - 1 - i];
        }
        return diagonalSum == magicNumber;
    }
}
