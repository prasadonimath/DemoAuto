package javaPractice.strings;

public class ReverseEachWordOfString {
    public static void main(String[] args) {

        String origString="Java is programming language";
        String[] words =origString.split(" ");
        String revString="";

        System.out.println("Before string : "+origString);

        for (int i=0;i<words.length;i++){
            String word = words[i];
            String revword = "";

            for (int j=word.length()-1;j>=0;j--){
                char ch=word.charAt(j);
                revword=revword+ch;
            }
            revString=revString+revword+" ";


        }

        System.out.println("Reversed string : "+revString);
    }
}
