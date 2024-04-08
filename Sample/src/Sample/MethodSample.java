package Sample;

public class MethodSample {

    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 10;
        
        
        sumMethod1(number1, number2);

    }
    
    
    public static void sumMethod1(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("sumMethodnoの結果は"　+ result);
        
    }
    
    
    public static int sumMethod2(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

}
