package DsaAlgo.TwoPointers;
import java.util.Arrays;
//MergeTwoSortedArray

public class MergeSortedArray {
    static int[] mergeTwoArray(int[] a, int m, int[] b, int n){       //a=[1,2,3,0,0,0]
        int last_idx = m + n-1;                                       // this ptr is at last index of a array
        int p1 = m-1;                                                 // ptr p1 is at index before 0 elements
        int p2 = n-1;                                                 //ptr p2 is at last index of b array

        while(p1>=0 && p2>=0){
            if(a[p1] > b[p2]){
                a[last_idx--] = a[p1--];
            }
            else{
                a[last_idx--] = b[p2--];
            }
        }
        while(p2>=0){
            a[last_idx--] = b[p2--];
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,4,5};
        int m = 3;
        int n = 3;
        System.out.println(Arrays.toString(mergeTwoArray(a, m, b, n)));
    }
}
