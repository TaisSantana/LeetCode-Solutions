package Easy.Arrays;

/*
Problem 26 - Remove Duplicates from Sorted Array
https://leetcode.com/problems/remove-duplicates-from-sorted-array/

Description:
Given a sorted array nums, remove the duplicates in-place such that each element appears only once
and returns the new length. Do not allocate extra space for another array; you must do this by
modifying the input array in-place with O(1) extra memory.

Solution:
- Use two pointers approach:
    1. lastNumberFound tracks the last unique number seen.
    2. insertPosition tracks the position to insert the next unique number.
- Iterate through the array, and if the current number is different from lastNumberFound,
  place it at insertPosition and update pointers.
- Time complexity: O(n)
- Space complexity: O(1)

Example:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
*/

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int lastNumberFound = nums[0] - 1;
        int insertPosition = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != lastNumberFound) {
                nums[insertPosition] = nums[i];
                lastNumberFound = nums[i];
                insertPosition++;
            }
        }

        return insertPosition;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesFromSortedArray sol1 = new RemoveDuplicatesFromSortedArray();
        int newLength = sol1.removeDuplicates(nums);
        System.out.print("Remove Duplicates Output: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNew length: " + newLength); // Deve imprimir 5

    }

}
