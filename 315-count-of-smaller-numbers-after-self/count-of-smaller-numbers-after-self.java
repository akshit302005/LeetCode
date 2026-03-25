class Solution {
    public List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        for(int num : nums) list.add(num);
        Collections.sort(list);
        for(int i=0;i<nums.length;i++){
            int idx=binarySearch(list,nums[i]);
            res.add(idx);
            list.remove(idx);
        }
        return res;
    }
    public int binarySearch(ArrayList<Integer> arr, int target){
        int start = 0;
        int end = arr.size()-1;
        int mid=0;
        
        while(start<=end){
            mid = start + ((end - start)/2);
            int val = arr.get(mid);
            if(val<target) start = mid + 1;
            else end = mid - 1;
        }
        if(arr.get(start) == target) return start;
        return mid;
    }
}