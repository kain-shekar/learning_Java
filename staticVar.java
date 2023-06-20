class demo {
    int a;
    int b;
    static int m;
    static int n;
    {
        a = 20;
        b = 40;
    }
    static {
        System.out.println("in static block");
        m = 100;
        n = 50;
    }

}

public class staticVar {

    public static void main(String arugs[]) {
        System.out.println("main function");
        System.out.println(demo.m);
        demo obj = new demo();
        System.out.println(obj.a);

    }
}
