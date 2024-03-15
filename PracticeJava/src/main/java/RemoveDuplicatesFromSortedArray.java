package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 1, 4, 5, 6, 5, 0};

        arr = Arrays.stream(arr).sorted().distinct().toArray();

            // Print the sorted array
            for (int num : arr) {
                System.out.print(num + " ");
            }

        }

    }



