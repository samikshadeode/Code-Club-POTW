class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=0;
        int empty=0;
        int filled=numBottles;
        int total_bottles=numBottles;
       while(filled>0)
       {
       total+=filled;
       empty=empty+filled;
       filled=0;
       filled=(empty/numExchange);
       empty=empty-(filled*numExchange);
       } 
       return total;
    }
}
