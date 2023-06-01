package Programs;

public class FibonacciNumber {
    // Fibonnaci Series
    // 0 1 1 2 3 ....

    public static int iterativeFib(int n) {

        int n1 = 0, n2 = 1;
        if (n <= 1) {
            return n;
        } else {

            for (int i = 1; i < n; i++) {
                int n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            return n2;
        }
    }

    public static int recursiveFib(int n) {

        if (n <= 1) {
            // for first two numbers and base
            // condition for recursion
            return n;
        } else {
            // sum of previous two numbers
            return recursiveFib(n - 2) +
                    recursiveFib(n - 1);
        }

    }

    public static void main(String[] args) {

        int index = 4;

        System.out.println("Fibonacci number at" +
                " index :" + index + " is" +
                recursiveFib(index));

        System.out.println("Fibonacci Series" +
                " upto index :" + index);

        for (int i = 0; i < index + 1; i++) {
            System.out.println(recursiveFib(i));
        }
    }

}