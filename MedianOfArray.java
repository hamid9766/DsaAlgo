package DsaAlgo;
//LeetCode Problem Find Median of 2 Arrays

public class MedianOfArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i =0;
        int j =0;
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[nums1.length + nums2.length];
        int k = 0;

        while (i<nums1.length || j<nums2.length){
            if (j<nums2.length && i<nums1.length && nums1[i]<nums2[j]) {
                arr[k++] = nums1[i];
                i++;
            }
            else if(j<nums2.length && i<nums1.length && nums1[i]>=nums2[j]){
                arr[k++] = nums2[j];
                j++;

            }
            else if(i==nums1.length && j<nums2.length){
                arr[k++] = nums2[j];
                j++;

            }
            else if(j==nums2.length && i<nums1.length){
                arr[k++] = nums1[i];
                i++;

            }
        }
        /*
        int mid =new
        */

        /*int mid = n/2;*/
        /*return n%2 == 0 ? (double) ((arr[mid-1] + arr[mid]) / 2) : (double) arr[mid];*/
        if((m+n)%2 == 1){
            return (double) arr[(m+n)/2];
        }
        else
            return (double) (arr[(m+n)/2 - 1] +arr[(m+n)/2])/2;
    }


    public static void main(String[] args) {
      float x = (float)findMedianSortedArrays(new int[]{1,2}, new int[]{3,4});
        System.out.println(x);
    }
}
