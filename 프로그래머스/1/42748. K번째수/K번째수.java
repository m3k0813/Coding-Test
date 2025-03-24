import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i < commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            
            int[] subArray = Arrays.copyOfRange(array, start-1, end);
            
            Arrays.sort(subArray);
            
            int index = commands[i][2] - 1;
            
            answer[i] = subArray[index];   
        }
        
        
        return answer;
    }
}