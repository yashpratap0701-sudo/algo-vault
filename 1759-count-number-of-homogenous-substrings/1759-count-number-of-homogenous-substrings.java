class Solution {
   public static int countHomogenous(String s) {
        long sum = 0;
        long count = 0;
        int mod = 1000000007;

        for (int i = 0; i < s.length(); i++) {

            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            sum = (sum + count) % mod;
        }

        return (int) sum;
    }
}