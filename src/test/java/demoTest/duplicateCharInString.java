package demoTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateCharInString {
    public static void main(String[] args) {
        String origString="Java is programming language";
        Map<Character,Integer> map=new HashMap<>();

        char arr[]=origString.replaceAll(" ","").toCharArray();

        for (int i=0;i<=arr.length-1;i++){
            char ch=arr[i];

            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }

        Set<Character> keys = map.keySet();

        for (Character c:keys){
            System.out.println(c+" - "+map.get(c));
        }
    }
}
