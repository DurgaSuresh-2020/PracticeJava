package main.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseSTRING {


    public static void main(String[] args){

        String s = "Hello the world";

        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(words);
        System.out.println(String.join(" ", words));


    }
}
