class Solution {
    public String solution(int n, int t, int m, int p) {
        String emp = "";
        int num = 0;
        while(emp.length() < m * t){
            String tmp = Integer.toString(num, n);
            emp += tmp;
            num++;
        } emp = emp.toUpperCase();

        String answer = "";
        for(int i = p - 1; answer.length() < t; i += m){
            answer += emp.charAt(i);
        }

        return answer;
    }
}