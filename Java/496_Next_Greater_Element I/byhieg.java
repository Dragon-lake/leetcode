public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int [] result = new int[findNums.length];
        int count = 0;
        for(int i = 0 ; i < findNums.length;i++){
            result[count] = -1;
            for(int j = 0 ;j < nums.length;j++){
                if(findNums[i] == nums[j]){
                    result[count] =  getBigger(findNums[i],nums,j);
                     break;
                    
                }
            }
            count++;

        }
        return result;
    }
    
    public int getBigger(int n,int[] nums,int target){
        for(int i = target ; i < nums.length;i++){
            if(nums[i] > n){
                return nums[i];
            }
        }
        return -1;
    }
}