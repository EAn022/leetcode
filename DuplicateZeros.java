import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args){
        int[] x = {1,2,0,4,5,0,2,0,1,0,4,0,9};
        duplicateZeros(x);
        System.out.println(Arrays.toString(x));
    }

    public static void duplicateZeros(int[] arr) {
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == 0){
                for(int j = arr.length - 1; j > i; j--){
                    arr[j] = arr[j - 1];
                }
            }
        }
    }

}

