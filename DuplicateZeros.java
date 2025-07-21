import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args){
        int[] x = {1,0,2,3,5};
        duplicateZeros2(x);
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

    public static void duplicateZeros2(int[] arr) {
        int length = arr.length - 1;
        int numZerosDoubles = 0;

        for(int leftPointer = 0; leftPointer <= length - numZerosDoubles; leftPointer++){
            if(arr[leftPointer] == 0){
                if(leftPointer == length - numZerosDoubles){
                    arr[leftPointer + numZerosDoubles] = 0;
                    length--;
                    break;
                }
                numZerosDoubles++;
            }
        }

        int last = length - numZerosDoubles;

        for(int rightPointer = last; rightPointer >= 0; rightPointer--){
            if(arr[rightPointer] == 0){
                arr[rightPointer + numZerosDoubles] = arr[rightPointer];
                numZerosDoubles--;
                arr[rightPointer + numZerosDoubles] = arr[rightPointer];
            }else{
                arr[rightPointer + numZerosDoubles] = arr[rightPointer];
            }
        }
    }
}

