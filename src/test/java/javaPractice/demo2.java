package javaPractice;

import java.util.*;

public class demo2 {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        // str="I like dog and cat but dog hates cat still i like cat and dogs"

        String stat="I like dog and cat but dog hates cat still i like cat and dogs";
        Map<String, Integer> counts=new HashMap<>();

        String[] splitstr=stat.split(" ");

        for(int i=0;i<splitstr.length;i++){
            if (counts.containsKey(splitstr[i])){
                counts.put(splitstr[i],counts.get(splitstr[i])+1);
            }else{
                counts.put(splitstr[i],1);
            }
        }
        Set name=counts.keySet();
        List key=new ArrayList<>(name);

        for(int j=0;j <key.size();j++){

            System.out.println(key.get(j) +" -- "+counts.get(key.get(j)));


        }

    }
}
