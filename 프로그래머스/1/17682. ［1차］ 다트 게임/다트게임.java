class Solution {
    public int solution(String dartResult) {
        int[]score = new int[3];
        int idx = -1;
        String s = "";
        for(char c : dartResult.toCharArray()){
            int res = 0;

            if(c == 'S' || c == 'D' || c == 'T'){
                idx++;
                int tmp = Integer.parseInt(s);
                s = "";

                if(c == 'S'){
                    score[idx] = tmp;
                } else if(c == 'D'){
                    score[idx] = (int) Math.pow(tmp, 2);
                } else if(c == 'T'){
                    score[idx] = (int) Math.pow(tmp, 3);
                }
            } else if(c == '*'){
                score[idx] *= 2;
                if(idx - 1 >= 0){
                    score[idx-1] *= 2;
                }
            } else if(c == '#'){
                score[idx] *= -1;
            } else {
                s += c;
            }
        }

        int answer = score[0] + score[1] + score[2];

        return answer;
    }
}
