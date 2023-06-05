//funtion program which takes 2 input and provide greater of those two

import java.util.*;

public class function {
    public static int greater(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
        // return 0;

    }

    public static void main(String argue[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        c = greater(a, b);
        System.out.println("greater number between " + a + " and " + b + " is :" + c);

    }
}