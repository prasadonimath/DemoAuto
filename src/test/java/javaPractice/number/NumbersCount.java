package javaPractice.number;

public class NumbersCount {
    public static void main(String[] args) {

        int number=12345;
        int display=number;
        int count=0;

        while(number>0){
            number=number/10;
            count++;
        }
        System.out.println("The count of digits in "+display+" is : "+count);
    }
}
