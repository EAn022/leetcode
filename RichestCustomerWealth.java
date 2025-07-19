public class RichestCustomerWealth {
    public static void main (String[] args){
        InnerRichestCustomerWealth solution = new InnerRichestCustomerWealth();
        int[][] x = {{3,2,1},{1,2,3}};
        System.out.println(solution.maximumWealth(x));
    }
}

class InnerRichestCustomerWealth {
  public int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(sum >= max) max = sum;
            sum = 0;
        }
        return max;
    }
}
