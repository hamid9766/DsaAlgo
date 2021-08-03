// Leetcode -1748
// Sum of Unique Elemnents

class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        int sum = 0;
         for(int num : nums){
             if(!map.containsKey(num) || map.get(num) <=1){
                 sum += num;
             }
         }
        return sum;
    }
}
