package javaPractice.strings;

public class Sample1 {
    public static void main(String[] args) {
        String input="a2b3c1";
        String output = "";

        for (int i=0;i<input.length();i+=2){
            char ch=input.charAt(i);
            int count=input.charAt(i+1) - '0';
//            System.out.println(ch);
//            System.out.println(count);
            for (int j =0;j<count;j++){
                output=output+ch;
            }
        }
        System.out.println(output);

    }
}
