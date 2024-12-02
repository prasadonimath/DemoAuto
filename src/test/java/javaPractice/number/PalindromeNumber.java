package javaPractice.number;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number=12121;
        int displayNo=number;
        int revnumber=0;

        while(number>0){
            int lastdigit=number%10;
            revnumber=revnumber*10+lastdigit;
            number=number/10;
        }

        if (displayNo == revnumber){
            System.out.println("Number "+displayNo+" is Palindrome Number.");
        }else {
            System.out.println("Number "+displayNo+" is not Palindrome Number.");
        }
    }
}
