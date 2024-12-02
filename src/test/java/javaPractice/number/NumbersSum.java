package javaPractice.number;

public class NumbersSum {
    public static void main(String[] args) {

        int no=123;
        int display=no;
        int sum=0;

        while(no>0){
            int digit = no % 10;
            sum=sum+digit;
            no=no/10;
        }
        System.out.println("The sum of "+display+" is : "+sum);
    }
}
