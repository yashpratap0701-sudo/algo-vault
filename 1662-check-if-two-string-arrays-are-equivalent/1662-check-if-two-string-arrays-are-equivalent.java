class Solution {
   public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    String one = "";
    String two = "";

    for (int i = 0; i < word1.length; i++) {
        one = one + word1[i];
    }

    for (int i = 0; i < word2.length; i++) {
        two = two + word2[i];
    }

    return one.equals(two);
}
}