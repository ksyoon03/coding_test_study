class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int mid_denom = denom1*denom2;
        int mid_num1 = numer1*denom2;
        int mid_num2 = numer2*denom1;
        int mid_sum = mid_num1+mid_num2;
        int i = mid_sum,j = mid_denom,p,g=0,min;
        if(i<j) {
			min=i;
		} else {
			min = j;
		}
		for(p = 1;p<=min;p++) {
			if(i%p==0&&j%p==0) {
				g=p;
			}
		}
        mid_sum = i/g;
        mid_denom = j/g;
        
        int[] answer = {mid_sum,mid_denom};
        return answer;
    }
}