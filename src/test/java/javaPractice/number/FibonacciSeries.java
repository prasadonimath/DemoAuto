package javaPractice.number;

public class FibonacciSeries {
    public static void main(String[] args) {
        int repeat=6;
        int fristNo=0;
        int secondNo=1;
        int nextNo;

        System.out.print("Fibonacci series are : "+fristNo+" ");
//        System.out.print(secondNo+" ");

        for (int i=0;i<=repeat;i++){
            nextNo=fristNo+secondNo;
            System.out.print(nextNo+" ");
            fristNo=secondNo;
            secondNo=nextNo;

        }


    }
}
