class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        
        
        for(int i = 0; i < nums.length-2; i++){
            int j = i +1;
            int k = nums.length-1;
            
            while(j < k){
                
                int currSum = nums[i] + nums[j] + nums[k];
                
                if(target - currSum == 0){
                    return currSum;
                }
                
                if(Math.abs(currSum - target) < Math.abs(closest - target)){
                    closest = currSum;
                }
                
                if(currSum < target){
                    j++;
                }
                else{
                    k--;
                }
                
                

            }
        }
        
        return closest;
    }
}