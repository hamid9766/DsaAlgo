package DsaAlgo;
//String -56
public class StringReverse {
        public static char[] reverseString(char[] s) {
            int left = 0;
            int right = s.length-1;
            while(left<right) {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;

            }
            return s;
        }

    public static void main(String[] args){
            char[] x= {'H','E', 'L', 'L', 'O'};
        System.out.println(reverseString(x));

    }

}
