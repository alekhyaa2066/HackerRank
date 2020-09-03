public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int b=0;
        int w=0;
        int max=scores[0];
        int min=scores[0];
        for(int i=1;i<scores.length;i++){
            if(max<scores[i]){
                max=scores[i];
                b++;
            }
            if(min>scores[i]){
                min=scores[i];
                w++;
            }
        }
        int a[]=new int[2];
        a[0]=b;
        a[1]=w;
        return a;
    }
