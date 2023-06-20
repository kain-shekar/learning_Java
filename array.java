// Write a Java program to calculate the sum of all elements in an integer array?

import java.util.*;

public class array {

    public static void main(String arrgue[]) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.println("enter array size:");
        size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("enter " + size + " elements in array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("the sum of all elements in an integer array is : ");
        int total = 0;
        for (int num : array) {
            total += num;
        }
        System.out.print(total);

    }
}