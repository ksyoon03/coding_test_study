public class Solution {
    public int[] solution(int n, int k) {
        int size = n/k;
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            if(k*i > n) break;
            answer[i] = k*(i+1);
        }
        return answer;
    }
}