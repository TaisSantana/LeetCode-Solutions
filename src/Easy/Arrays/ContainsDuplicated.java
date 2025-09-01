package Easy.Arrays;
import java.util.Set;
import java.util.HashSet;

/*
Problem 217 - Contains Duplicate
https://leetcode.com/problems/contains-duplicate/

Description:
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Solution:
- Use a HashSet to keep track of seen elements.
- Iterate through the array:
    - If the element is already in the set, return true (duplicate found).
    - Otherwise, add it to the set.
- If the loop finishes without finding duplicates, return false.
- Time complexity: O(n)
- Space complexity: O(n)
*/

public class ContainsDuplicated {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicated rd = new ContainsDuplicated();

        int[] nums = {1, 2, 4, 5, 1};

        boolean haveDuplicated = rd.containsDuplicate(nums);

        System.out.print("Contains Duplicated: " + haveDuplicated);

    }

}

