// Write a program to demonstrate method overloading with 3 different parameters.
class method {
    public static int add(int a, int b) {
        int res1 = a + b;
        return res1;
    }

    public static double add(double a, double b) {
        double res2 = a + b;
        return res2;
    }

    public static int add(int a, int b, int c) {
        int res1 = a + b + c;
        return res1;
    }

    public static void main(String[] argue) {
        method obj = new method();
        int res1 = obj.add(2, 3);
        double res2 = obj.add(5.6, 9.5);
        int res3 = obj.add(8, 9, 12);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

    }
}
