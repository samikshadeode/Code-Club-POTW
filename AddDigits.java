class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int rem=num;
            int sum=0;
            while(rem>0)
            {
               sum+=rem%10;
               rem=rem/10;
            }
           num=sum;
        }
        return num;
    }
}
