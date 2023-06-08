// Write a Java program to find the index of a specific element in an integer array.?

import java.util.*;

public class array2 {

    public static void main(String argue[]) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.println("enter size of array:");
        size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("enter " + size + " elements in array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("enter a element to find its index:");
        int key = sc.nextInt();
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == key) {
                System.out.println("element " + key + " is at index " + i);
            }
        }
    }
}