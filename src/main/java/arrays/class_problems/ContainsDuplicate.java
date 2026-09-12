package arrays.class_problems;

import java.util.Arrays;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("nums = " + Arrays.toString(nums1) + " -> " + containsDuplicate(nums1));

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("nums = " + Arrays.toString(nums2) + " -> " + containsDuplicate(nums2));
    }
}