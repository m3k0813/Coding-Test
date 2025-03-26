import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] stArr = new String[numbers.length]; 
        StringBuilder sb = new StringBuilder();
        
        Arrays.sort(numbers);
        
        for(int i=0; i<stArr.length; i++){
            stArr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(stArr, (a, b) -> (b + a).compareTo(a + b));
        
        if (stArr[0].equals("0")) {
            return "0";
        }
        
        for(String s : stArr) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}