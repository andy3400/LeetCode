class Solution {
    public int[] plusOne(int[] digits) {
        // 반복문을 통해서 숫자로 변환
        // 숫자 변환 이후, + 1
        // 다시 array 형태
        // 숫자가 모두 9일때 carry 사용 
        int n = digits.length;

        for(int i = n -1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}