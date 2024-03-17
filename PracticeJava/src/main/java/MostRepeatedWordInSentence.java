package main.java;

import java.util.Arrays;
import java.util.List;

public class MostRepeatedWordInSentence {


    public static void main(String[] args){

        String s = "Hello the world the world the";
        int count = 0;
        int maxCount = 0;
        String repeatedWord = null;

        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        for (int i = 0; i<words.size();i++){
            for(int j=i+1;j<words.size();j++) {
                if (words.get(i).equals(words.get(j))) {
                    count++;
                }
            }

                if(maxCount<count){
                    maxCount=count;
                    repeatedWord = words.get(i);

            }

        }



        System.out.println("Most repeated word is "+ repeatedWord);


    }
}
