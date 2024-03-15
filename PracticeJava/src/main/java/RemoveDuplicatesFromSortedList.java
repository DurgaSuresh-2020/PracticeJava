package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {

        List<Integer> list =new ArrayList<>(Arrays.asList(2, 2, 3, 1, 4, 5, 6, 5, 0));

        list = list.stream().sorted().distinct().toList();

                System.out.print(list);

        }

    }



