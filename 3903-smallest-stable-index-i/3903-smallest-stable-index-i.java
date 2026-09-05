class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        for(int i =0;i<nums.length;i++){
            int min=nums[i];
            int max=nums[i];
        
            for(int j=0;j<i;j++){
                max=Math.max(max,nums[j]);
            }
            for(int j=i+1;j<nums.length;j++){
                min = Math.min(min,nums[j]);
            }
            if(max - min <= k ){
                return i;
            }

        }
        return -1;
    }
}