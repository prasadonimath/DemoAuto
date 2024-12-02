package javaPractice.strings;

import static org.testng.Assert.assertEquals;

public class ReverseString {
	public static <Char> void main(String[] args) {
		
		String originalWord= "test";
		String displayorig=originalWord;
		int wordLen = originalWord.length();
//		System.out.println("Original word length : "+wordLen);
		String reversedWord="";

		/*for (int i =0;i<wordLen;i++) {
			char ch= originalWord.charAt(i);
			reversedWord=ch+reversedWord;
		}
		for (int i =wordLen-1;i>=0;i--) {
			char ch= originalWord.charAt(i);
			reversedWord=ch+reversedWord;
		}
		*/

		for (int i =wordLen-1;i>=0;i--) {
			char ch= originalWord.charAt(i);
			reversedWord=reversedWord+ch;
		}

		System.out.println("The original word is : "+displayorig);
		System.out.println("The reversed word is : "+reversedWord);
	}

}
