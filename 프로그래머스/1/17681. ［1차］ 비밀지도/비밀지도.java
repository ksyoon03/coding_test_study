class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            answer[i] = Integer.toString(arr1[i] | arr2[i], 2);
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replace("1", "#").replace("0", " ");
        }
        
        return answer;
    }
}
