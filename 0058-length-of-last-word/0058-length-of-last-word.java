class Solution {
    public int lengthOfLastWord(String s) {
    int count = 0;

    for (int t = s.length() - 1; t >= 0; t--) {
        if (s.charAt(t) != ' ') {
            count++;
        } 
        else if (count > 0) {
            return count;
        }
    }

    return count;
}
}