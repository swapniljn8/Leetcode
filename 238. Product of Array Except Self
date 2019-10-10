class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res = 1;
        int count = 0;
        int output[] = new int[nums.length];
        int val = -1;
        int j = 0;
        for(Integer s : nums) {
            ++val;
            if(s == 0) {
                ++count;
                j = val;
                
            }
            else {
                res = res * s;
            }
            if(count == 2) { 
                res = 0;
                return output;
            }
            
        }
        
        for(int i= 0; i < nums.length; ++i) {
            if(count == 1) {
                output[j] = res;
                return output;
            }
            else {
                output[i] = res / nums[i];    
            }
            
        }
        return output;
    }
}
