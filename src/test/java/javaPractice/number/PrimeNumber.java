package javaPractice.number;

public class PrimeNumber {
    public static void main(String args[]){


        int number =25;
        int count = 0;
        for (int i= 1;i<=number;i++){
            if (number% i ==0 && number%number==0){
                count++;
            }
        }
        System.out.println(count);
        if (count==2){
            System.out.println("Its prime");
        }
        else {
            System.out.println("Its not Prime Number");
        }
    }


}
