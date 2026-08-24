class Solution {
   public static boolean isPalindrome(String s) {
        StringBuilder v = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                v.append(Character.toLowerCase(ch));

            }

        }
        for(int j = 0;j<v.length()/2 ;j++){
            if(v.charAt(j)!=v.charAt(v.length()-1-j)){
                return false;
            }
        }
        return true;

    }
}