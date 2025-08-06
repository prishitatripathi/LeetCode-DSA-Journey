import java.util.*;

class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];

        // Merge arrays
        for (int i = 0; i < m; i++) 
        {
            merged[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) 
        {
            merged[m + i] = nums2[i];
        }

        Arrays.sort(merged);

        int total = m + n;
        if (total % 2 == 0) 
        {
            return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        } 
        else 
        {
            return merged[total / 2];
        }
    }

    public static void main(String[] args) 
    {
        Solution sol = new Solution();

        // Sample input
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double result = sol.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median is: " + result);
    }
}
