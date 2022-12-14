public class PrimeNumber {

    public static boolean prime(int num){
        
        if(num==0 || num==1){
            return false;
        }
        else{
            //num/2 avaoids the second half because in second half we are never gonna get remainder as 0
            //ex: for num=10, if we do 10/6, 10/7, 10/8, 10/9 remainder will never come as 0, which is the case for every number
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(prime(7));
        
    }
    
}
