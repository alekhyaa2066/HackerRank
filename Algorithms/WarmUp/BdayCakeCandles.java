public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int n=ar.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(ar[i]>max)
                max=ar[i];
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(ar[i]==max)
                c++;
        }
        return c;
    }
