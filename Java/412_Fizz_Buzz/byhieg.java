public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1;i <= n;i++){
            if(i % 3 == 0){
                if(i % 5 == 0){
                    result.add("FizzBuzz");
                }else{
                    result.add("Fizz");
                }
            }else if(i % 5 == 0){
                result.add("Buzz");
            }else{
                result.add(i + "");
            }
        }
        return result;
    }
}