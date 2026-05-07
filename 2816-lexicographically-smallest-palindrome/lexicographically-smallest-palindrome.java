class Solution {
    public String makeSmallestPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] arr = s.toCharArray();
        while(left <= right){
            if(s.charAt(left) == s.charAt(right)) {
            }
            else{
                if(s.charAt(left) < s.charAt(right)) {
                    // arr[left] = s.charAt(left);
                    arr[right] = s.charAt(left);
                }else{
                    arr[left] = s.charAt(right);
                    // arr[right] = s.charAt(right);
                }
            }
            left++;
            right--;
        }
        return new String(arr);
    }
}