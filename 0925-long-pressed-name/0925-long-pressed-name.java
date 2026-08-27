class Solution {
   public static boolean isLongPressedName(String name, String typed) {

    int i = 0;
    int j = 0;

    while (j < typed.length()) {

        // Normal matching character
        if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
            i++;
            j++;
        }

        // Long-pressed character
        else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
            j++;
        }

        // Character doesn't match
        else {
            return false;
        }
    }

    // Every character of name must have been matched
    return i == name.length();
}
}