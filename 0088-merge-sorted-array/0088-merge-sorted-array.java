class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int mi = m-1;
        int ni = n-1;
        int ci = m + n - 1;

        while (ni >= 0){
            if(mi >= 0 && nums1[mi] > nums2[ni]){
                nums1[ci] = nums1[mi];
                mi --;
            }
            else {
                nums1[ci] = nums2[ni];
                ni --;
            }
            ci--;
        }

    }
}