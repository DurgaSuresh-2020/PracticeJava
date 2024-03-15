package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Merge2SortedLists {

    public static void main(String[] args) {

        List<Integer> list1 =new ArrayList<>(Arrays.asList(1,3,5));
        List<Integer> list2 =new ArrayList<>(Arrays.asList(2,4,6));
        List<Integer> mergedList =new ArrayList<>();

        list1 = list1.stream().sorted().toList();
        list2 = list2.stream().sorted().toList();

        mergedList.addAll(list1);
        mergedList.addAll(list2);

        System.out.println(mergedList);

        }

    }



