import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] a){
        int[] x = {2,3,0,0,0};
        int[] y = {1,2,7};
        merge(x, x.length, y, y.length);
    }
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Pointer = 0, nums2Pointer = 0;
        int[] aux = new int[m];
        
        for(int i = 0; i < m; i++){
            if(Math.abs(nums1[nums1Pointer]) >= Math.abs(nums2[nums2Pointer])){

            }
        }
    }
}
