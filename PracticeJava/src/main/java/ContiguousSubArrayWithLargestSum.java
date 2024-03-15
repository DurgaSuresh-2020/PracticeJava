package main.java;

public class ContiguousSubArrayWithLargestSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6, 7, 8, 0};
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // If adding the current element to the current subarray improves the sum, extend the subarray.
            // Otherwise, start a new subarray with the current element.
            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
            } else {
                currentSum = currentSum + arr[i];
            }

            // Update the maximum sum encountered so far.
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
    }
}

