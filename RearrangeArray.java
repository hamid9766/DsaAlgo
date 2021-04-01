package DsaAlgo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RearrangeArray {
    static int[] reArrange(int[] array){
        HashSet<Integer> set = new HashSet<>();
        int i =0,  j=1;
            while (array[i]<0 && array[j]>0){
                set.add(array[i]);
                set.add(array[j]);
                i++;
                j++;
            }

            while (array[i]<0 && array[j]<0){
                j++;
                set.add(array[i]);
                if (array[j]>0){
                    set.add(j);
                }

            }

        while (array[i]>0){
            set.add(array[i]);
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println((int[])reArrange(new int[]{1,2,3,-4,-1,4}));

    }

}
