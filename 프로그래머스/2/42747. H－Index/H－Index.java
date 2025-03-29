import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        int h = 1;
        
        Arrays.sort(citations);
        
        for(int i = 0; i < n ; i++){
            int cnt = 0;
            
            for(int citation: citations){
             
                if(citation >= h){
                    cnt++;
                }
                
                if(cnt >= h){
                    answer = h;
                    break;
                }
            }
            
            h++;
        }
            
        return answer;
    }
}
