class Solution {
    public int maxProfit(int[] a) {
        if(a.length == 0) {
            return 0;
        }
        else{
            int min = a[0];
            int profit = 0;
            for(int i = 0; i < a.length; ++i) {
                profit = a[i] - min > profit ? a[i] - min : profit;
                if(a[i] < min)
                    min = a[i];
            }
        return profit;
        }
    }
}
