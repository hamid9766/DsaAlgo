import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Occurence {

    public static Map<Character, Integer> findOccurrences(String input) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] ch = input.toCharArray();
        for(char c : ch){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else
                map.put(c,1);
        }
        char maxOccur = input.charAt(0);
        for(Character key : map.keySet()){
            if (map.get(key)> map.get(maxOccur)){
                maxOccur = key;
            }
        }
        System.out.println(maxOccur);

        return map;
    }

    public static void main(String args[]) {

        String input = "occurrence";
        Map<Character, Integer> occurrenceMap = findOccurrences(input);

        System.out.println("Occurrences of characters\n=======================");
        for (Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey()+" -- "+entry.getValue());
        }

    }

}