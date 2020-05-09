class Solution {
    public boolean check(int num, int val, int x, int y) {
            int j =0;
            boolean flag = false;
            for(int i =val ; i <= (int)num/2; i = i+j) {
                //System.out.println(i );
                if(flag){
                    j = x;
                    flag = false;
                    if(i*i == num)
                        return true;
                }
                else if(!flag) {
                    j = y;
                    flag = true;
                    if(i*i == num)
                        return true;
                }
            }
        return false;
    }
    public boolean isPerfectSquare(int num) {
        int unit = num%10;
        if(num==1)return true;
        if(unit == 2 || unit == 3 || unit == 7 || unit == 8){
            return false;
        }
        else if(unit == 5) {
            for(int i = 5; i < (int)num/2; i = i+10) {
                if(i*i == num)
                    return true;
            }
        }
        else if(unit == 0) {
            for(int i = 10; i < (int)num/2; i = i + 10) {
                if(i*i == num)
                    return true;
            }
        }
        else if(unit == 1) {//correct
            return check(num, 1, 2, 8);
        }
        else if(unit == 4) {//correct
            return check(num, 2, 4, 6);
        }
        else if(unit == 6) {//correct
            return check(num, 4, 8, 2);
        }
        else if(unit == 9) {//correct
            return check(num, 3, 6, 4);
        }
        return false;
    }
}
