public class StringPalindrome {
    

    public static boolean palindromeCheck(String str){

        int n=str.length();

        String res="";

        for(int i=n-1;i>=0;i--){
            res=res+str.charAt(i);
        }

        if(str.equals(res)){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        
    }
}
