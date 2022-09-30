package main;

import java.util.Arrays;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        int[] trueSortedNumbers = sortedNumbers;
        Arrays.sort(sortedNumbers);
        int right = trueSortedNumbers.length - 1;
        int left = 0;
        while (right >= left) {
            int mid = left + ((right - left) / 2);
            if (trueSortedNumbers[mid] > n) {
                right = mid;
            } else if (trueSortedNumbers[mid] < n) {
                left = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
