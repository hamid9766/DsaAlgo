package DsaAlgo.String;
import java.util.*;

public class ToggleCase {

    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);

            if(curr>='A' && curr<='Z'){
                char tlc = (char)('a'+ curr - 'A');
                sb.append(tlc);
            }
            else{
                char tup = (char)('A'+ curr - 'a');
                sb.append(tup);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}