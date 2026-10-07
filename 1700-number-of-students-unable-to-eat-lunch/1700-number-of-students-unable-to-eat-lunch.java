class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

     int  []count  = {0,0};

     for(int i = 0;i<students.length;i++){
        count[students[i]]++;
     }
      for(int i = 0;i<sandwiches.length;i++){
       if(count[sandwiches[i]]==0){
        break;
       }
        else{
            count[sandwiches[i]]--;

        }

        }
       
       return count[0] + count[1];
    }

}