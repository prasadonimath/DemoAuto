package javaPractice.number;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseNumberArr {
    public static void main(String[] args) {
        int arr[]={123,246,876};


        System.out.println("Before reverse array : "+Arrays.toString(arr));

        for (int i=0;i< arr.length;i++){
            int num=arr[i];
            int revno=0;
            while(num>0){
                revno=revno*10+num%10;
                num=num/10;
            }
            arr[i]=revno;
        }
        System.out.println("After reverse array : "+Arrays.toString(arr));

    }
}
