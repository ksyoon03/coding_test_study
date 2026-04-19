import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> arr = new ArrayList<>();

        for(int i = 0; i < data.length; i++){
            if(ext.equals("code")){
                if(data[i][0] < val_ext) {
                    arr.add(data[i]);
                }
            } else if (ext.equals("date")) {
                if(data[i][1] < val_ext) {
                    arr.add(data[i]);
                }
            } else if (ext.equals("maximum")){
                if(data[i][2] < val_ext) {
                    arr.add(data[i]);
                }
            } else {
                if(data[i][3] < val_ext) {
                    arr.add(data[i]);
                }
            }
        }

        int idx;
        if(sort_by.equals("code")) {
            idx = 0;
        } else if (sort_by.equals(("date"))) {
            idx = 1;
        } else if (sort_by.equals("maximum")) {
            idx = 2;
        } else {
            idx = 3;
        }

        arr.sort((a, b) -> {
            return Integer.compare(a[idx], b[idx]);
        });


        int[][] answer = new int[arr.size()][4];
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }

        return answer;
    }
}