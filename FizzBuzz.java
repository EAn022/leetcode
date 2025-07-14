import java.util.ArrayList;
import java.util.List;

public class FizzBuzz{
    public static void main(String[] args){
        InnerFizzBuzz3 solution = new InnerFizzBuzz3();
        System.out.println(solution.fizzBuzz(15));
        
    }
}

class InnerFizzBuzz{
    public List<String> fizzBuzz(int n){
        List<String> response = new ArrayList<String>(n);

        for(int i = 1; i <= n; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                response.add("FizzBuzz");
            } else{

                if(i % 3 == 0){
                    response.add("Fizz");
                } else{

                    if(i % 5 == 0){
                        response.add("Buzz");
                    } else response.add(String.valueOf(i));
                }
            }
        }

        return response;
    }
}

class InnerFizzBuzz2{
    public List<String> fizzBuzz(int n){
        List<String> response = new ArrayList<>(n);

        for(int i = 1; i <= n; i++){
            StringBuilder sb = new StringBuilder();
            if(i % 3 == 0) sb.append("Fizz");
            if(i % 5 == 0) sb.append("Buzz");
            if(sb.isEmpty()) sb.append(i);

            response.add(sb.toString());
        }
        return response;
    }
}

class InnerFizzBuzz3{
    public List<String> fizzBuzz(int n){
        List<String> response = new ArrayList<>(n);

        for(int i = 1; i <= n; i++){
            String str = (i % 3 == 0 ? "Fizz" : "") + 
                        (i % 5 == 0 ? "Buzz": "");

            response.add(str.isEmpty() ? String.valueOf(i) : str);
        }
        return response;
    }
}