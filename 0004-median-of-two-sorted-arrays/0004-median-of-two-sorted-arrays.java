class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int num[] = new int[m+n];
        
        for(int i = 0; i < m; i++)  num[i] = nums1[i];
        
        for(int i = 0; i < n; i++)  num[m++] = nums2[i];
         
        int mid = num.length/2;
            
        Arrays.sort(num);
        
        if(num.length%2 != 0)  return num[mid];
        else return (double)(num[mid-1]+num[mid])/2;
    }
}