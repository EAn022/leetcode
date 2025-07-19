import java.util.Arrays;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        InnerRunningSumof1dArray solution = new InnerRunningSumof1dArray();
        int[] x = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution.runningSum(x)));
    }
}

class InnerRunningSumof1dArray{
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            
            nums[i] =nums[i] + nums[i-1];
        }
        return nums;
    }
}
