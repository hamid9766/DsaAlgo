//InterviewBit Solution 
//a = [11, 3, 4, 6] , b = 3 
//output -  4,6,11

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> a, int b) {
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        for(int i : a){
            min_heap.add(i);
            if(min_heap.size()>b) {                     //If the size goes beyond b then it will pop the elements to maintain the size of heap
                min_heap.poll();
            }
        }
        return new ArrayList<>(min_heap);               //here just returning the the elements in min heap after the loop ends
    }
}


// ------------------------------------------------------------------------------------------------------------------------------------------
/* 
    Leetcode solution for K th Largest Element  [3,2,1,5,6,4], k = 2
    output - 5
*/
// ------------------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int i: nums){
            minHeap.add(i);
            if(minHeap.size()>k)
                minHeap.poll();
        }
        return minHeap.poll();
    }
}
