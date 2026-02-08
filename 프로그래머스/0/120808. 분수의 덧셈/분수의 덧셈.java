class Solution {
    public int[] solution(int num1, int denum1, int num2, int denum2) {
        int[] answer = new int[2];
        
        int num3 = num1*denum2 + num2*denum1;
        int denum3 = denum1*denum2;
        int max = 1;
        
        for(int i=1; i<=num3 && i<=denum3; i++){
            if(num3%i==0 && denum3 % i==0){
                max=i;
            }
        }
        
        answer[0] = num3 / max;
        answer[1] = denum3 / max;
        
        return answer;
    }
}