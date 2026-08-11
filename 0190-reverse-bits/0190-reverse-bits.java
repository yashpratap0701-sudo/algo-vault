class Solution {
   public static int reverseBits(int n) {

        int[] num1 = new int[32];

        
        for (int i = 0; i < 32; i++) {
            num1[i] = n & 1;
            n = n >>> 1;
        }

       
        int num2 = 0;

        for (int i = 0; i < 32; i++) {
            num2 = (num2 << 1) | num1[i];
        }

        return num2;
    }
}