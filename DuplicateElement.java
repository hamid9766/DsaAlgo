package DsaAlgo;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {
    public static void removeDuplicate(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;

        for (int i=0; i<=len-1; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else
                map.put(nums[i],map.get(nums[i])+1);
        }

        for (Map.Entry<Integer,Integer> m : map.entrySet()){
            Integer key = m.getKey();
            Integer value = m.getValue();
            if (value==1){
                System.out.println(key + " , count = " + value);
            }
        }
    }

    public static void main(String[] args) {
        int[] n = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicate(n);
    }
}
