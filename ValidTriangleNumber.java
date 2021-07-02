//Leetcode -611 and gfg
// we will use traingle property that sum of 2 sides is always greater than the 3 one
// first sort array and then put one pointer on leftmost position and one on right postition
// r is at n-1 index
// [6, 5, 4, 9, 8] --- first sort this 

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        
        int count = 0;
        for(int i = nums.length-1; i>=2; i--){
            int l = 0;
            int r = i-1;
            
            while(l<r){
                if(nums[l] + nums[r] > nums[i]){
                    count += (r-l);
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        
        return count;
        
    }
}
