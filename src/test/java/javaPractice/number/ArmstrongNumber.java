package javaPractice.number;

public class ArmstrongNumber {

    public static void main(String[] args) {
//it is wrong code need to check
        int no =153;
        int displayNo=no;
        int arm = 0;
        int a,b;
        while (no>0){
            a=no%10;
            no=no/10;
            arm=arm+a*a*a;
        }
        if (arm==no){
            System.out.println("The number "+displayNo+" is Armstrong Number");
        }else{
            System.out.println("The number "+displayNo+" is not Armstrong Number");
        }


    }
}
