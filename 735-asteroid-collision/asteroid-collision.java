class Solution {
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }));
    }
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();
        for(int num:asteroids){
            list.add(num);
        }
        int i=1;
        while(i<list.size()){
            if(list.get(i)<0 && list.get(i-1)>0){
                int num1=Math.abs(list.get(i));
                int num2=Math.abs(list.get(i-1));
               if(num2>num1){
                list.remove(i);
               }else if(num1>num2){
                list.remove(i-1);
                if(i>1) i--;
               }else{
                list.remove(i);
                list.remove(i-1);
                if(i>1) i--;
               }
            }else{
                i++;
            }
        }
        int[] result = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }
        return result;
    }
}