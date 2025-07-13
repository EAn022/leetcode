package leetcode;

public class AddTwoIntegers {
    public static void main(String[] args){
        Solution somador = new Solution();
        System.out.println(somador.sum(10, 20));
    }
}

class Solution {
    public int sum (int num1, int num2){
        return num1 + num2;
    }
}
