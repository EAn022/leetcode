public class AddTwoIntegers {
    public static void main(String[] args){
        InnerAddTwoIntegers somador = new InnerAddTwoIntegers();
        System.out.println(somador.sum(10, 20));
    }
}

class InnerAddTwoIntegers {
    public int sum (int num1, int num2){
        return num1 + num2;
    }
}
