class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();


        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] < pivot){
                left.add(nums[i]);
            }else if(nums[i] == pivot){
                equal.add(nums[i]);
            }else{
                right.add(nums[i]);
            }
        }

        int[] ans = new int[nums.length];
        int idx = 0;
        for(int i : left) ans[idx++] = i;
        for(int i : equal) ans[idx++] = i;
        for(int i : right) ans[idx++] = i;

        return ans;
    }
}