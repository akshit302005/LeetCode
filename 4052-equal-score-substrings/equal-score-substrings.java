class Solution {
    public boolean scoreBalance(String s) {
        int sum=0;
        int sum2=0;
        for(char ch : s.toCharArray()){
            sum+= ch-'a'+1;
        }
       for(int i=0;i<s.length();i++){
        sum2+=s.charAt(i)-'a'+1;
        sum-=s.charAt(i)-'a'+1;
        if(sum==sum2){
            return true;
        }
       }
        return false;
    }
}