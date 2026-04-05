
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];

        for(int i = 0; i < n; i++){
            answer[i] = "";

            String res1 = Integer.toBinaryString(arr1[i]);
            String res2 = Integer.toBinaryString(arr2[i]);

            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int j = 0; j < n; j++){
                sb1.append("0");
                sb2.append("0");
            }

            int idx1 = n - res1.length();
            int idx2 = n - res2.length();
            for(int k = 0; k < res1.length(); k++){
                sb1.setCharAt(idx1 + k, res1.charAt(k));
            }
            for(int z = 0; z < res2.length(); z++){
                sb2.setCharAt(idx2 + z, res2.charAt(z));
            }

            String fin1 = sb1.toString();
            String fin2 = sb2.toString();

            for(int x = 0; x < n; x++){
                if(fin1.charAt(x) == '1' || fin2.charAt(x) == '1'){
                    answer[i] += "#";
                } else if(fin1.charAt(x) == '0' && fin2.charAt(x) == '0'){
                    answer[i] += " ";
                }
            }
        }

        return answer;
    }
}