import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] board, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< board.length; i++){
            for(int j=0;j<board[i].length;j++){
                if(i+j<=k) list.add(board[i][j]);
            }
        }
        int answer = list.get(0);
        for(int i=1; i<list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }
}