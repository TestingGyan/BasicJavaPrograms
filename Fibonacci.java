public class Fibonacci{


    public static int iterative(int n){

        int n1=0,n2=1;

        if(n<=1){
            return n;
        }

        for(int i=1;i<n;i++){
          
          int n3=n1+n2;
          n1=n2;
          n2=n3;  
        }

        return n2;
      
    }


    public static int recursive(int n){
       if(n<=1){
        return n;
       }
       
       return recursive(n-1)+recursive(n-2);
    }

public static void main(String[] args) {
    
    int n=10;
    System.out.println("Iterative Fibonnaci");

    for(int i=1;i<n;i++){
    System.out.println(iterative(i));
    }
    


    System.out.println("Recursive Fibonnaci");

    for(int i=1;i<n;i++){
        System.out.println(recursive(i));
    }
}

}