class Solution {
    public int solution(int n, int k) {
        int totalN = n*12000;
        int totalK = k*2000;
        int service = n/10 * 2000;
        int answer = totalN + totalK - service;
        return answer;
    }
}