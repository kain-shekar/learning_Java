import java.util.*;

public class calci {
    public static void main(String[] argue) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST VALUE:");
        float a = sc.nextFloat();
        System.out.println("ENTER OPERATOR [ '+','-','/','%']");
        char op = sc.next().charAt(0);
        System.out.println("ENTER SECOND VALUE :");
        float b = sc.nextFloat();
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
}
