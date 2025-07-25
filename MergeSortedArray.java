import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] a){
        int[] x = {2,3,0,0,0};
        int[] y = {1,2,7};
        merge2(x, 2, y, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Pointer = m - 1, nums2Pointer = n - 1, size = nums1.length - 1;
        int[] aux = new int[size + 1];
        
         for(int i = size; i >= 0; i--){
        if (nums1Pointer < 0) {
            aux[i] = nums2[nums2Pointer--];
        } else if (nums2Pointer < 0) {
            aux[i] = nums1[nums1Pointer--];
        } else if (nums1[nums1Pointer] > nums2[nums2Pointer]) {
            aux[i] = nums1[nums1Pointer--];
        } else {
            aux[i] = nums2[nums2Pointer--];
        }
    }
        for (int i : aux) System.out.println(i);  
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, p = nums1.length - 1;
        
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1--];
            } else {
                nums1[p] = nums2[p2--];
            }
            p--;
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }

        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
