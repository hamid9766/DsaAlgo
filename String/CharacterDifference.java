package DsaAlgo.String;

//write difference between every consecutive character and then append that character too

public class CharacterDifference {
    public static String charDifference(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for(int i= 1; i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int gap = curr -prev;

            sb.append(gap);
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(charDifference("mapro"));

    }
}
