package DsaAlgo;
import java.io.*;

public class Solution{
        static int countIntervals(int[][] arr, int V, int N)
        {
            // Variable to store the count of intervals
            int count = 0;

            // Variables to store start and end of an interval
            int li, ri;

            for (int i = 0; i < N; i++) {
                li = arr[i][0];
                ri = arr[i][1];

                // Implies V lies in the interval
                // so increase count
                if (V >= li && V <= ri)
                    count++;
            }
            return count;
        }

        // Driver code
        public static void main(String args[])
        {
            int[][] arr = { { 1, 10 }, { 5, 10 },
                    { 15, 25 }, { 7, 12 }, { 20, 25 } };

            int V = 7;

            // length of the array
            int N = arr.length;

            System.out.println(countIntervals(arr, V, N));
        }
    }

