class Solution {
    public boolean isPalindrome(int x) {
        // positive Or negaitve
        if( x >= 0 ){
            int origin = x;
            int reverse = 0;

            while( x != 0){
                int digit = x % 10;
                reverse = reverse*10 + digit;
                x = x/10;
            }

            return origin == reverse;
        }
        else return false;
    }
}