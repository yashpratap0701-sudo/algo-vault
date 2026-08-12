class Solution {
   public boolean isReachable(int targetX, int targetY) {

        while (targetX % 2 == 0) {
            targetX /= 2;
        }

        while (targetY % 2 == 0) {
            targetY /= 2;
        }

        return gcd(targetX, targetY) == 1;
    }

    public int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        return x;
    }
}