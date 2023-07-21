class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int num[] = new int[m+n];
        int cnt = 0;
        
        for(int i = 0; i < m; i++){
            num[i] = nums1[i];
            cnt++;
        }
        
        for(int i = 0; i < n; i++){
            num[cnt] = nums2[i];
            cnt++;
        }
        
        int l = num.length;
        
        int median = num.length/2;
        Arrays.sort(num);
        if(l%2 != 0){
            return num[median];
        }
        else{
            return (double)(num[median]+num[median-1])/2;
        }
    }
}