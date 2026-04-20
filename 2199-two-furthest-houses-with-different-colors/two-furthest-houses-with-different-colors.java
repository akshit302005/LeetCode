class Solution {
    public int maxDistance(int[] colors) {
        int max = colors[0];
        int max2 = colors[colors.length-1];
        int maxIndex=0;
        int maxIndex2=colors.length-1;
        for(int i = 0 ; i < colors.length ; i++){
            if(colors[i] != max){
                maxIndex = Math.max(i,maxIndex) ;
            }
        }
        for(int j=colors.length-1; j >= 0 ; j--){
            if(colors[j] != max2){
                maxIndex2=colors.length-j-1;;
            }
        }
        return Math.max(maxIndex,maxIndex2);
    }
}