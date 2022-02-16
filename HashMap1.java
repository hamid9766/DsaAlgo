
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class HashMap1 {


    public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo) {
        //Implement your logic here and change the return statement accordingly
        for (String name : mapTwo.keySet()) {
            {
                if (mapOne.containsKey(name)) {
                    String newName = name + "new";
                    mapOne.put(newName, mapTwo.get(name));
                }
                else
                {
                    mapOne.put(name, mapTwo.get(name));
                }
            }
        }
        return mapOne;
    }

    public static void main(String args[]) {
        Map<String, Integer> mapOne = new HashMap<String, Integer>();
        mapOne.put("Jim", 10);
        mapOne.put("Micheal", 20);
        mapOne.put("Ryan", 30);

        Map<String, Integer> mapTwo = new HashMap<String, Integer>();
        mapTwo.put("Jim", 15);
        mapTwo.put("Andy", 45);

        Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

        System.out.println("Merged Map\n===========");
        for (Entry<String, Integer> entry : mergedMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

    }
}
