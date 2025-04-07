class Solution {
    public void rotate(int[] nums, int k) {

        int length = nums.length;

        k = k % length;

        int[] result = new int[length];

        for(int i= 0; i < length; i++){
            result[(i+k)%length] = nums[i];
        }

        for(int i=0; i < length; i++){
            nums[i] = result[i];
        }
    }
}