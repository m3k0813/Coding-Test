import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int move = name.length() - 1;

        for (int i = 0; i < name.length(); i++) {

            char c = name.charAt(i);
            answer += Math.min(c - 'A', 'Z' - c + 1);

            int next = i + 1;
            while (next < name.length() && name.charAt(next) == 'A') {
                next++;
            }

            move = Math.min(move, i + name.length() - next + Math.min(i, name.length() - next));
        }

        return answer + move;
    }
}