
public class Solution {
    public String[] findWords(String[] words) {
        String one = "AaSsDdFfGgHhJjKkLl";
        String two = "QqWwEeRrTtYyUuIiOoPp";
        String three = "ZzXxCcVvBbNnMm";
        int a = 0;
        boolean isEnd = true;
        String [] strs = new String[words.length];
        int count = 0;
        for(int i = 0 ; i < words.length;i++){
            char[] chars = words[i].toCharArray();
            if(one.contains(chars[0] + "")){
                a = 1;
            }else if(two.contains(chars[0] + "")){
                a = 2;
            }else if(three.contains(chars[0] + "")){
                a = 3;
            }
            switch(a){
                case 1:
                    for(int j = 1 ; j < chars.length;j++){
                        if(!one.contains(chars[j] + "")){
                            isEnd = false;
                        }
                    }
                    if(isEnd){
                        strs[count++] = words[i];
                    }
                    isEnd = true;
                    break;
                case 2:
                    for(int j = 1 ; j < chars.length;j++){
                        if(!two.contains(chars[j] + "")){
                            isEnd = false;
                        }
                    }
                    if(isEnd){
                        strs[count++] = words[i];
                    }
                    isEnd = true;
                    break;
                case 3:
                    for(int j = 1 ; j < chars.length;j++){
                        if(!three.contains(chars[j] + "")){
                            isEnd = false;
                        }
                    }
                    if(isEnd){
                        strs[count++] = words[i];
                    }
                    isEnd = true;
                    break;
            }
        }
        String [] result = strs;
        for(int i = 0 ; i < strs.length;i++){
            if(strs[i] == null){
                result = Arrays.copyOfRange(strs,0,i);
                break;
            }
        }
        return result;
    }
}