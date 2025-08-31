package Easy.Arrays;
/*
Problem 189 - Rotate Array
https://leetcode.com/problems/rotate-array/

Description:
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
The rotation must be done in-place without allocating another array for the result.

Solution:
- Normalize k with k = k % nums.length (to avoid unnecessary rotations).
- I do this to handle cases where k is greater than the length of the array,
and also when the array index plus k exceeds the array length. This takes care of all such cases.
- Array is rotated in-place.
- Time complexity: O(n)
- Space complexity: O(1)

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
Rotate 1 step -> [7,1,2,3,4,5,6]
Rotate 2 steps -> [6,7,1,2,3,4,5]
Rotate 3 steps -> [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
*/

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int count=1;
        int temp = 0;
        int start = 0;

        while (count <= nums.length){
            int i = start;
            int prev = nums[start];

            do {
                int current = (i+k) % (nums.length);
                temp = nums[current];
                nums[current] = prev;
                prev = temp;
                i = current;
                count++;
            } while (start != i);

            start++;


        }
    }

    public static void main(String[] args) {
        RotateArray solution = new RotateArray();

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        solution.rotate(nums1, k1);
        System.out.println("Rotated array 1: " + java.util.Arrays.toString(nums1));

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        solution.rotate(nums2, k2);
        System.out.println("Rotated array 2: " + java.util.Arrays.toString(nums2));
    }


}
