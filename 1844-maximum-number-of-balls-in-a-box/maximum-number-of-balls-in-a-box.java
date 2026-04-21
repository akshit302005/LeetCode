class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = lowLimit ; i <= highLimit ; i++){
            int res = sumOfDigit(i);
            if(map.containsKey(res)){
                map.put(res,map.getOrDefault(res,0)+1);
            }else{
                map.put(res,1);
            }
        }
            int max = 0;
            for(int key : map.keySet()){
                if(map.get(key) > max){
                    max = map.get(key);
                }
            }
        //System.out.print(map);
        return max ;
    }
    public int sumOfDigit(int n){
        int sum=0;
        while(n!=0){
            int temp = n%10;
            sum=sum+temp;
            n=n/10;
        }
         return sum;
    }
}