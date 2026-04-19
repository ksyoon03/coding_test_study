class Solution {
    private int getS(String str){
        return Integer.parseInt(str.split(":")[0]) * 60 + Integer.parseInt(str.split(":")[1]);
    }
    
    private int getP(int s, int e, int p){
        if(p >= s && p <= e){
            return e;
        }
        return p;
    }
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int t, s, e, p;
        t = getS(video_len);
        s = getS(op_start);
        e = getS(op_end);
        p = getS(pos);
        p = getP(s, e, p);

        for(String cmd : commands){
            if(cmd.equals("next")){
                p = Math.min(p + 10, t);
            } else {
                p = Math.max(p - 10, 0);
            }
            p = getP(s, e, p);
        }
        
        return String.format("%02d:%02d", p / 60, p % 60);
    }
}