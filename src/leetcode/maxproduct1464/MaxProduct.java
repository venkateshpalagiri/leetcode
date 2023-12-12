package leetcode.maxproduct1464;

import java.util.Arrays;

public class MaxProduct {
	public static void main(String[] args) {
		int[] case1= {3,4,5,2};
		int[] case2= {1,5,4,5};
		int[] case3= {3,7};
		maxProduct(case1);
		maxProduct(case2);
		maxProduct(case3);
		
	}
	public static void maxProduct(int[] nums) {
		Arrays.sort(nums);
		int a=nums[nums.length-1];
		int b=nums[nums.length-2];
        System.out.println((a-1)*(b-1));
     
        
    }

}

/*

1464. Maximum Product of Two Elements in an Array

Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 

Example 1:

Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
Example 2:

Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
Example 3:

Input: nums = [3,7]
Output: 12
 

Constraints:

2 <= nums.length <= 500
1 <= nums[i] <= 10^3

*/


/* Best possible solution

class Solution {
public int maxProduct(int[] nums) {

    int right = nums.length - 1 , left = 0;
    //brute force method 
    // sort 
    Arrays.sort(nums);

    // mul max with next ele

    int temp = (nums[right] - 1) * (nums[right - 1] - 1);
    return temp;   
}
}

*/