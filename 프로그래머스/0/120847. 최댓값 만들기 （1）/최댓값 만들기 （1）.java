import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length-1;
        int max1 = numbers[n];
        int max2 = numbers[n-1];
        
        return max1 * max2;
    }
}