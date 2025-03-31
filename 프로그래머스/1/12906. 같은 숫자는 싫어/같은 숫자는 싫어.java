import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> s = new Stack<>();
        
        for(int n : arr){
            
            if(!s.empty() && s.peek() == n){
                continue;
            }
            
            s.push(n);
        }
        
        return s.stream().mapToInt(i -> i).toArray();
    }
}