package DsaAlgo;
import java.util.Arrays;
//Optimised solution with tc - O((n+m)*log(n+m))

public class MergeTwoSortedArray {
    public static void merge(int[] arr1, int[] arr2, int n, int m){
        int i = n-1;                                                    // [1,5,9,10,15,20] i is at 20
        int j = 0;                                                      // [2,3,8,13] j is at 2
        while (i>=0 && j<m){
            //this loop will automatically put all greater values in 2 array
            if(arr1[i]> arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--; j++;
            }
            else {
                break;
            }
        }
        // it is required as now we are having unsorted arrays with smaller elements on 1 arr and larger on 2 array
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 9, 10, 15, 20};
        int[] b = {2, 3, 8, 13};
        int n =6;
        int m =4;
        merge(a,b,n,m);
        System.out.println(Arrays.toString(a) +" " + Arrays.toString(b));
    }
}
