package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFind2NumbersAddingUp2TargetNumber {

    public static void main(String[] args){


    List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 7, 8, 0));
    int targetSum = 8;
    List<Integer> subArr = new ArrayList<>();

    for(int i = 0;i<arr.size();i++){
        if(arr.contains(targetSum -arr.get(i))){
            subArr.add(arr.get(i));
            subArr.add(arr.get(arr.indexOf(targetSum- arr.get(i))));
            break;
        }

    }

    System.out.println(subArr);

    }

}
