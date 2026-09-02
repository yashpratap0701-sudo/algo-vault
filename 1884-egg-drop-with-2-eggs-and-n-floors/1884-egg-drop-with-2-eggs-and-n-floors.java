class Solution {
    public int twoEggDrop(int n) {
        int c = 0;
        int l =1;
        while(n>0){
            c++;
            n = n-l;
            l++;

        }
        return c;
        
    
        
        
    }
}