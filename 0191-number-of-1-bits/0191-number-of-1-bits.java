class Solution {
    public static int hammingWeight(int n) {
        int a = 0;
        int count = 0;
        for (int i = 0; i <=31 ; i++) {
            a = n%2;
            n = n/2;
            if(a==1){
              count++;
            }
            
        }
        return count;


    }
}