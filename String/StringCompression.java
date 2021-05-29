package DsaAlgo.String;

public class StringCompression {
    public static String comp1(String str){
        String s = ""+ str.charAt(0);
        for(int i =1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr !=  prev)
                s += curr;
        }
        return s;

    }

    public static String comp2(String str){
        String s = ""+ str.charAt(0);
        int count =1;
        for(int i =1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr == prev) {
                count++;
            }
            else{
               if(count>1) {
                   s += count;
                   count = 1;
               }
               s += curr;
            }

        }

        //this will print the count value if there are no char remaining and we are out of loop
        if (count>1)
            s +=count;
            count=1;

        return s;

    }

    public static void main(String[] args) {
        System.out.println(comp1("aaabbbccaeef"));
        System.out.println(comp2("aaabbbccaeef"));
    }
}
