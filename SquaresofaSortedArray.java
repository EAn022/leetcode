import java.util.Arrays;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int[] x = {-7,-3,2,3,11};
        x = sortedSquares2(x);
        for(int a : x) System.out.println(a);
    }

    public static int[] sortedSquares(int[] nums) {
       for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static int[] sortedSquares2(int[] nums) {
        int[] result = new int[nums.length];
        int indice = nums.length - 1;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            if (Math.abs(nums[right]) >= Math.abs(nums[left])) {
                result[indice] = nums[right] * nums[right];
                right--;
                indice--;
            } else{
                result[indice] = nums[left] * nums[left];
                left++;
                indice--;
            }
        }

        return result;
    }
    
}

