public class NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args){
        InnerNumberofStepstoReduceaNumbertoZero solution = new InnerNumberofStepstoReduceaNumbertoZero();
        System.out.println(solution.numberOfSteps(8));
    }
}

class InnerNumberofStepstoReduceaNumbertoZero {
    public int numberOfSteps(int num) { 
        int steps = 0;

        while(num != 0){
            if(num % 2 != 0){ 
                num--;
                steps++;
            } else {
                num/=2;
                steps++;
            }
        }
        return steps;
    }    
}