package javaPractice.number;

public class FactorialOfNumber {
    public static void main(String[] args) {

        int factOfNo=5;
        int facto = 1;
        for (int i=factOfNo;i>0;i--){
            facto=facto*i;
        }
        System.out.println("Factorial of "+factOfNo+" is : "+facto);
    }
}
