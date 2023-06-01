package Programs;

public class ReverseString {
    public static void reverseString(String str) {
        int length = str.length();

        String res = "";
        int index = length - 1;

        while (index >= 0) {
            res = res + str.charAt(index);
            index--;
        }

        System.out.println(res);
    }

    public static void main(String[] args) {

        String name = "Tarun";

        reverseString(name);
    }

}
