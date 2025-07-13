public class RunningSumof1dArray {
    public static void main(String[] args) {
        
    }
}

class Solution{
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            
            nums[i] =nums[i] + nums[1-i];
        }
        return nums;
    }
}
