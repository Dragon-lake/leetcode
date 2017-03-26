public class Solution {
    public int[] countBits(int num) {
        List<Integer> lists = new ArrayList<>();
        for(int i = 0 ; i <= num;i++){
            String tmp = Integer.toBinaryString(i);
            int a = Integer.valueOf(tmp,2);
            int n = 0;
            while(a != 0){
                if((a & 1) == 1){
                    n ++;
                }                    
                a = a>>1;

            }
            lists.add(n);
        }
        int [] result = new int[lists.size()];
        for(int i = 0 ; i < lists.size();i++){
            result[i] = lists.get(i);
        }
        return result;
    }
}