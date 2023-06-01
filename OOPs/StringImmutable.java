package OOPs;

public class StringImmutable {

    public void stringReference() {

        // s1 and s2 two references points to same string in string constant pool in
        // heap area
        // If string value is same than new string wil not be created in constant pool
        // and multiple references will point to same value
        String s1 = "Tarun";
        String s2 = "Tarun";

        s1.concat("Prashar"); // This will simply create new string in constant pool, without any reference
        System.out.println(s1); // This will Print Tarun only as reference s1 is still pointing to Tarun

        s1 = s1.concat("Prashar"); // Now reference will point to Tarun Prashar string in constant pool
        System.out.println(s1); // This will print Tarun Prashar

        String s3 = "Neha";
        System.out.println(s2);// Prints Tarun
        System.out.println(s3);// Prints Neha

        s3 = s2; // s3 reference changes to s2 therefore s3 will also point to same string as s2
                 // in constant pool

        System.out.println(s3); // prints Tarun
        System.out.println(s2); // prints Tarun

    }

    public static void main(String[] args) {

        StringImmutable obj = new StringImmutable();
        obj.stringReference();

    }

}
