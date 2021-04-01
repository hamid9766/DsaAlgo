package DsaAlgo;
//String-57

public class Palindrome {

    static int isPalindrome(String s){
        String empty ="";
        int len = s.length();
        for (int i = len-1; i>=0; i--){
            empty = empty + s.charAt(i);
        }
        if (!s.equals(empty))
            return 0;
        return 1;
    }

    public static void main(String[] args){

        System.out.println(isPalindrome("hamid"));
    }
}
