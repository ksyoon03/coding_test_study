import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();

        int cnt = 1;
        for(int i : ingredient){
            stk.push(i);

            if(stk.size() >= 4){
                int idx1 = stk.size()-1;
                int[]tmp = new int[4];
                for(int j=0; j<4; j++){
                    tmp[j] = stk.get(idx1);
                    idx1--;
                }
                if(tmp[0] == 1 && tmp[1] == 3 && tmp[2] == 2 && tmp[3] == 1){
                    answer++;
                    
                    int a = 4;
                    while(a-- > 0){
                        stk.pop();
                    }
                }
            }
        }

        return answer;
    }
}