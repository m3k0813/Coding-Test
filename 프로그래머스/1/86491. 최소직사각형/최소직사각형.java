import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        
        for (int i = 0; i < sizes.length; i++) {

            int width = Math.max(sizes[i][0], sizes[i][1]);
            int height = Math.min(sizes[i][0], sizes[i][1]);
            
            w = Math.max(w, width);
            h = Math.max(h, height);
        }
        
        return w * h;
    }
}