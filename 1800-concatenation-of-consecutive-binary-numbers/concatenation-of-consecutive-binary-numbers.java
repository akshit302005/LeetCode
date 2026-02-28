class Solution {
    public int concatenatedBinary(int n) {
        int mod=1000000007;
        long result=0;
        for(int i=1;i<=n;i++){
            result=((result<<Integer.toBinaryString(i).length())+i)%mod;

        }
        return (int) result;
    }
}