class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = park.length;
        int y = park[0].length();

        char[] dir = new char[routes.length];
        int[] step = new int[routes.length];
        for(int i=0; i<routes.length; i++){
            dir[i] = routes[i].charAt(0);
            step[i] = routes[i].charAt(2) - '0';
        }

        int curY = 0;
        int curX = 0;
        char[][]c = new char[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                c[i][j] = park[i].charAt(j);
                if(c[i][j] == 'S'){
                    curY = i;
                    curX = j;
                }
            }
        }

        for(int i=0; i<routes.length; i++){
            int tmpX = curX;
            int tmpY = curY;
            for(int j=0; j<step[i]; j++){
                if(dir[i] == 'E') curX++;
                else if(dir[i] == 'W') curX--;
                else if(dir[i] == 'N') curY--;
                else curY++;

                if(curX >= park[0].length() || curX < 0 || curY >= park.length || curY < 0 || c[curY][curX] == 'X'){
                    curX = tmpX;
                    curY = tmpY;
                    break;
                }
            }
        }
        int[] answer = {curY, curX};

        return answer;
    }
}