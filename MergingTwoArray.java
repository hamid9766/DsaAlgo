package DsaAlgo;

import java.util.Arrays;
//this solution will not efficient as it will run out of time.

//Array -17
public class MergingTwoArray {
    static void merge(int[] x, int[] y){
        //[3,27,38,43] [7,11,15]
        int m = x.length;
        int n = y.length;

        for (int i = 0; i<m; i++){
            // Considering each element x[i] of array x and ignoring that it is in
            // correct order, and swap it with the y[0] element i.e first element of
            // y array

            if (x[i] > y[0]){
                // swapping x[i] with y[0]
                int temp = x[i];
                x[i] = y[0];
                y[0] = temp;

                // storing the y[0] at first and comparing with rest of elements
                int first = y[0];

                int k;
                // to maintain the y array in a sorted order as upper swapping may
                // disturb the order.
                for (k=1; k<n && y[k] < first; k++){
                    y[k-1] = y[k];
                }
                //updating the previous elemnet with new value i.e smaller one
                y[k-1] = first;
            }
        }
    }

    public static void print(int[] array){
        for (int i : array )
            System.out.print(array+ "");
    }

    public static void main(String[] args) {
       merge(new int[]{4,7,8,15}, new int[]{1,6,8,10});


        }

}
