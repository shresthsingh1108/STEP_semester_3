package arrays.class_problems;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] res1 = twoSum(nums1, target1);
        System.out.println("nums = [2, 7, 11, 15], target = 9 -> " + Arrays.toString(res1));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] res2 = twoSum(nums2, target2);
        System.out.println("nums = [3, 2, 4], target = 6 -> " + Arrays.toString(res2));
    }
}