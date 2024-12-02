package javaPractice.strings;

public class countOfWordsInString {
    public static void main(String[] args) {
        String str="Java is programming language";
        String arr[]=str.split(" ");
        int noWords = arr.length;
        System.out.println("Number of words in '"+str+"' are : "+noWords);
    }
}
