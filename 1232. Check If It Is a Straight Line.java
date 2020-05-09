class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int del_x = coordinates[1][0] - coordinates[0][0];
        int del_y = coordinates[1][1] - coordinates[0][1];
        double m = 0.0;
        if(del_x == 0) {
            double c = 0.0;
            int x = coordinates[0][0];
            int y = coordinates[0][1];
            c = y;
            for(int i =0; i < coordinates.length; ++i) {
                if(y != coordinates[i][1])
                    return false;
            }    
        }
        else {
            m = del_y/del_x;
            double c = 0.0;
            int x = coordinates[0][0];
            int y = coordinates[0][1];
            c = y - (m * x);
            for(int i =0; i < coordinates.length; ++i) {
                double res = coordinates[i][1] - (m*coordinates[i][0]) - c;
                if(res != 0)
                    return false;
                }
        }
        return true;
     }
    
}
