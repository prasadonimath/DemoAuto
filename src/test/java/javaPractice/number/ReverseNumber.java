package javaPractice.number;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=12345;
        int displayorig=number;
        int reversedNumber=0;

//        System.out.println(number); //eliminates last digit
//        System.out.println(number%10); //gives only last digit

        while (number>0){
            reversedNumber=reversedNumber*10+number % 10;;
            number=number/10;
        }
        System.out.println("The original number is : "+displayorig);
        System.out.println("The reversed number is : "+reversedNumber);
    }
}
