class Solution {
    public int longestPalindrome(String s) {
        char[] arr=s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int sum=0;
        boolean has1=false;
        for(int key:map.values()){
            if(key%2==0){
                sum+=key;
            }else{
                sum+=key-1;
                has1=true;
            }
        }
        if(has1) sum+=1;
        return sum;
    }
}