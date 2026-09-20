class Solution {
    public int arrangeCoins(int n) {
    int num=1;
    while(n>0){
        num++;
        n=n-num;
    }
    return  num-1;
    }
}