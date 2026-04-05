import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();

        for(int i = 0; i <moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int k = moves[i] - 1;
                if (board[j][k] != 0) {
                    if (stk.isEmpty()) {
                        stk.push(board[j][k]);
                    } else {
                        if (stk.peek() == board[j][k]) {
                            stk.pop();
                            answer += 2;
                        } else {
                            stk.push(board[j][k]);
                        }
                    }
                    board[j][k] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}