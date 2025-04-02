import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++){
            
            int day = 0;
            
            while(progresses[i] < 100){
                
                progresses[i] += speeds[i];
                day++;
            }
            
            queue.add(day);
        }
        

        while (!queue.isEmpty()){
            
            int cnt = 1;
            int first = queue.poll();
            
            while (!queue.isEmpty() && queue.peek() <= first) {
                
                queue.poll();
                cnt++;
            }
            
            answer.add(cnt);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}