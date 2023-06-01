package Programs;

public class SwapTwoNumbers {

    public static void swap(int n1, int n2) {

        System.out.println(n1 + ":" + n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println(n1 + ":" + n2);

    }

    public static void main(String[] args) {

        swap(10, 20);

    }

}
