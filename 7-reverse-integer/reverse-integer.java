class Solution {
    public int reverse(int x) {
        int reversedNum = 0;
        int max = Integer.MAX_VALUE / 10;
        int min = Integer.MIN_VALUE / 10;
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            
            if (reversedNum > max || (reversedNum == max && digit > 7)) {
                return 0;
            }
            if (reversedNum < min || (reversedNum == min && digit < -8)) {
                return 0;
            }
            
            reversedNum = reversedNum * 10 + digit;
        }
        
        return reversedNum;
    }
}