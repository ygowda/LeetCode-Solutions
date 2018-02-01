class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int low = 0; 
        int high = nums.length - 1;
        int[] soln = {-1, -1};
        
        
        while(low<=high){
            int mid = (low + high)/2;
            
            if(nums[mid] > target){
                high = mid-1;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                
                soln[0] = mid;
                soln[1] = mid;
                
                int lowLow = 0;
                int lowHigh = mid; 
                int highHigh = nums.length -1;
                int highLow = mid;
                
                while(lowLow <= lowHigh){
                    int lowMid = (lowLow + lowHigh)/2;
                    
                    if(nums[lowMid] < target){
                        lowLow = lowMid + 1;
                    }
                    else if(nums[lowMid] == target){
                        soln[0] =lowMid;
                        lowHigh = lowMid - 1;
                    }
                }
                
                while(highLow <= highHigh){
                    int highMid = (highLow + highHigh)/2;
                    
                    if(nums[highMid] > target){
                        highHigh = highMid - 1;
                    }
                    else if(nums[highMid] == target){
                        soln[1] = highMid;
                        highLow = highMid + 1;
                    }
                }
                
                low = high+1;
            }  
        }
        
        return soln;
    }
}