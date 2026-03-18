class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            int length=Math.min(height[left],height[right]);
            int breadth=Math.abs(left-right);
            int area=length*breadth;

            max = Math.max(max,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}