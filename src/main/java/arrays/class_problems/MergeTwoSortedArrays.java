package arrays.class_problems;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        if (arr1 == null) arr1 = new int[0];
        if (arr2 == null) arr2 = new int[0];

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];

        int p1 = 0;
        int p2 = 0;
        int i = 0;

        while (p1 < n1 && p2 < n2) {
            if (arr1[p1] <= arr2[p2]) {
                result[i++] = arr1[p1++];
            } else {
                result[i++] = arr2[p2++];
            }
        }

        while (p1 < n1) {
            result[i++] = arr1[p1++];
        }

        while (p2 < n2) {
            result[i++] = arr2[p2++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        System.out.println("arr1 = [1, 3, 5], arr2 = [2, 4, 6] -> " + Arrays.toString(mergeSortedArrays(arr1, arr2)));

        int[] arr3 = {};
        int[] arr4 = {1, 2, 3};
        System.out.println("arr1 = [], arr2 = [1, 2, 3] -> " + Arrays.toString(mergeSortedArrays(arr3, arr4)));
    }
}