package main.java;

import java.util.*;

public class FindLengthOfLongestConsecutiveNumbersInArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 3, 2, 5, 6, 4, 9, 11, 12, 13, 15,17,16,14 , 18));
        list = list.stream().distinct().sorted().toList();
        System.out.println(list);

        List<Integer> currentConsecutiveNumbers = new ArrayList<>();
        List<Integer> longestConsecutiveNumbers = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            currentConsecutiveNumbers.add(list.get(i-1));
            if (list.get(i) == list.get(i - 1) + 1) {
                currentConsecutiveNumbers.add(list.get(i));
            } else {
                if (currentConsecutiveNumbers.size() > longestConsecutiveNumbers.size()) {
                    longestConsecutiveNumbers = new ArrayList<>(currentConsecutiveNumbers);
                }
                currentConsecutiveNumbers.clear();
            }
        }

       // Check if the last sequence is the longest
        if (currentConsecutiveNumbers.size() > longestConsecutiveNumbers.size()) {
            longestConsecutiveNumbers = new ArrayList<>(currentConsecutiveNumbers);
        }

        longestConsecutiveNumbers = longestConsecutiveNumbers.stream().distinct().toList();

        System.out.println("Longest consecutive sequence: " + longestConsecutiveNumbers);
        System.out.println("Length of the longest consecutive sequence: " + longestConsecutiveNumbers.size());
    }
}
