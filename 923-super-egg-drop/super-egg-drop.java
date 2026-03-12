class Solution {
    public int superEggDrop(int k, int n) {
        int i=0, dp[]=new int[k+1];
        for(i=0;dp[k]<n;i++)
        {
            for(int j=k;j>0;j--)
                dp[j]+=dp[j-1]+1;
        }
        return i;
    }
}