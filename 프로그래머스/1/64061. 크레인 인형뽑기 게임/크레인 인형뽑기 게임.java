import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();

        for(int y : moves){
            for(int x = 0; x < board.length; x++){
                if(board[x][y-1] != 0){
                    if(!stk.isEmpty() && stk.peek() == board[x][y-1]){
                        stk.pop();
                        answer+=2;
                    }else{
                        stk.push(board[x][y-1]);
                    }
                    board[x][y-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
