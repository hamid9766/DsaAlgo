package DsaAlgo;
import java.util.HashMap;
import java.util.Map;
//String-58

public class RepeatedElements {
    static void checkDuplication(String s){
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i<s.length(); i++){
            if (!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), 1);
            else
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }

        for (Map.Entry<Character, Integer> mapElement : map.entrySet()){
            char key = (char)mapElement.getKey();
            int value = (int)mapElement.getValue();

            if (value>1)
                System.out.println(key + " , count = " + value);

        }

    }

    public static void main(String[] args) {
        checkDuplication("geekforgeeks");
    }
}
