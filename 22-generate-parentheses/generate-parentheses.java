class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list,"",0,0,n);
        return list;
        
    }
    public void backtrack(List<String> list,String cur,int first,int last,int max){
        if(cur.length()==max*2){
            list.add(cur);
            return;
        }
        if(first<max){
            backtrack(list,cur+"(",first+1,last,max);

        }if(last<first){
            backtrack(list,cur+")",first,last+1,max);
        }
    }
}