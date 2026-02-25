class Solution {
    public int[] sortByBits(int[] arr) {
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int num:arr){
        //     map.put(num,Integer.bitCount(num));

        // }
        Integer[] temp = new Integer[arr.length];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[i];
        }
        //System.out.print(map);
       // List<Integer> list = new ArrayList<>(map.keySet());
        Arrays.sort(temp,new Comparator<Integer>(){
            public int compare(Integer a , Integer b){
                int bitCompare=Integer.bitCount(a)-Integer.bitCount(b);
                if(bitCompare!=0){
                    return bitCompare;
                }
                return a-b;
            }
        });
        //System.out.print(list);
        int[] nums=new int[arr.length];
        for(int i=0;i<temp.length;i++){
            nums[i]=temp[i];
        }
        return nums;
    }
}