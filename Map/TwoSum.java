package DsaAlgo.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class TwoSum {
    public static List<Integer> tsum(int[] nums , int target){
            List<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i =0; i<nums.length; i++){
                int curr =nums[i];
                if(map.containsKey(target - curr)){

                    //if return type is int[] then simply use return new int[]{map.get(target-curr),i};
                    list.add(map.get(target - curr));
                    list.add(i);

                }
                map.put(curr,i);
            }
            return list;

    }

    public static void main(String[] args) {
        int[] nums =  {3,2,4};
        System.out.println(tsum(nums,6));

    }
}
