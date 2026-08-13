class Solution {
    public int singleNumber(int[] arr) {

        int unique = 0;

        for (int i = 0; i < arr.length; i++) {
            unique = unique ^ arr[i];
        }

        return unique;
    }
}