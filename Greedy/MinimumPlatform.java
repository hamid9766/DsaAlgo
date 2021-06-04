package DsaAlgo.Greedy;

import java.util.Arrays;
import java.util.Scanner;
//GFG And HackerRank Problem -- Platform required

public class MinimumPlatform {
    public static int platform(int[] arr , int[] dept, int n){
        Arrays.sort(arr);                         //sorting will help in comparing the timing
        Arrays.sort(dept);

        int platform_req =1, result =1;
        int i =1, j=0;                            // using 2 pointer method

        while(i<n && j<n){
            if(arr[i] <= dept[j]){                  //if arrival time of train is <= dept time then
                platform_req ++;                    // platform required to avoid collision
                i++;                                // increment to check the next train time
            }
            else if(arr[i] > dept[j]){              //if arrival time of train is > dept time that means train is leaving
                platform_req--;                     //as platform is empty so we can decrease the requirement
                j++;
            }

            if(platform_req > result)
                result =platform_req;
        }
        return  result;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dept = new int[n];
        int i= 0;

        while(sc.hasNext()){
            arr[i] = sc.nextInt();
            dept[i] = sc.nextInt();
        }

        System.out.println(platform(arr, dept, n));
    }
}
