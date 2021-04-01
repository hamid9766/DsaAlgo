package DsaAlgo;

import java.util.HashMap;

public class CountPair {
    static int getPairCount(int[] arr, int n, int k ) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            int rr = k-arr[i];
            if(mp.containsKey(rr))
            {
                count += mp.get(rr);
                mp.put(arr[i],mp.get(arr[i])==null?1:mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],mp.get(arr[i])==null?1:mp.get(arr[i])+1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr ={1,1,1,1};
        System.out.println(getPairCount(arr, 4,2));
    }
}
