public class Solution {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
         int max=0;
         for(int i=0;i<keyboards.length;i++){
             for(int j=0;j<drives.length;j++){
                 if(keyboards[i]+drives[j]>max && keyboards[i]+drives[j]<=b){
                     max=keyboards[i]+drives[j];
                 }
                
             }
         }
         if(max>b || max==0)
            return -1;
         else
            return max;

    }
