package OOPs;

public class StaticKeyword {

    int a = 10;

    int b = 20;

    static int c = 20;

    static int d = 30;

    {
        c = 30;
        d = 50;
        a = 20;
        b = 30;
    }

    public static void sum() {
        System.out.println("static method static sum " + (c + d));

        // can't use non static data members in static scope directly, CT error
        // System.out.println(a+b);

        StaticKeyword key = new StaticKeyword();

        System.out.println("static method -- non static sum,  using object creation" + (key.a + key.b));

    }

    public void sum2() {

        System.out.println("non static method - static sum without object creation" + (c + d));
        System.out.println("non static method - non static sum without object creation" + (a + b));

        // calling static method in non static scope without any object creation
        System.out.println("calling static method in non static scope without any object creation");
        sum();
    }

    public static void main(String[] args) {

        sum(); // calling static method in static scope without any need of object creation

        StaticKeyword key = new StaticKeyword();

        key.sum2(); // calling non static method in static scope with object creation

        sum();
    }

}
