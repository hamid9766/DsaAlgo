package DsaAlgo;
import java.util.HashSet;
import java.util.Set;
//Array-16

public class RepeatedNumber {
    public static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums){
            if (set.contains(n))
                return n;
            set.add(n);
        }
        return -1;
    }

    public static void main(String[] args){

        System.out.println(findDuplicate(new int[]{3,2,1,5,5}));

    }
}

