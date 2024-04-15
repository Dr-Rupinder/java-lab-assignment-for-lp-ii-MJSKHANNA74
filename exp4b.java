/*Write a program that takes an array of integers as input and removes duplicate elements, returning an array with only unique elements.*/
package lp2;
import java.util.*;

public class exp4b{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();
        Integer[] array = new Integer[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        HashSet<Integer> set = new HashSet<>(Arrays.asList(array));
        Integer[] uniqueArray = set.toArray(new Integer[0]);

        System.out.println("Array after removing duplicates:");
        for (Integer num : uniqueArray) {
            System.out.println(num);
        }
    }
}

