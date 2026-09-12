package arrays.assigment_problems;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;

        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1); // Base case: prefix sum 0 occurs once

        for (int num : nums) {
            currentSum += num;

            if (prefixMap.containsKey(currentSum - k)) {
                count += prefixMap.get(currentSum - k);
            }

            prefixMap.put(currentSum, prefixMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println("nums = [1, 1, 1], k = 2 -> " + subarraySum(nums1, k1));

        int[] nums2 = {1, -1, 0};
        int k2 = 0;
        System.out.println("nums = [1, -1, 0], k = 0 -> " + subarraySum(nums2, k2));
    }
}