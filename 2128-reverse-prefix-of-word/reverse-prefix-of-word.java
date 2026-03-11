class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder st = new StringBuilder();
        int count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch && count==0){
                st.append(word.charAt(i));
                count++;
                st.reverse();
            }else{
                st.append(word.charAt(i));
            }
        }
        return st.toString();
    }
}