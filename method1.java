
// Write a program to create an object of an class which contain a method and call that class method in main method
import java.util.*;

public class method1 {
    public static void calci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST VALUE:");
        double a = sc.nextDouble();
        System.out.println("ENTER OPERATOR [ '+','-','/','%']");
        char op = sc.next().charAt(0);
        System.out.println("ENTER SECOND VALUE :");
        double b = sc.nextDouble();
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("invalid choice!!!");
                break;
        }
    }

    public static void main(String argue[]) {
        method1 obj = new method1();
        obj.calci();

    }
}
