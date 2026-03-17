class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1) return 1;
        int[] freq = new int[n+1];
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<trust.length;i++){
            set.add(trust[i][0]);
            freq[trust[i][1]]++;
        }
        for(int i=1;i<=n;i++){
            if(freq[i]== n-1 && !set.contains(i)) return i;
        }
        return -1;
    }
}