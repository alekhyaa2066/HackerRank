public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int c=0;
        for(int i=0;i<n;i++){
            if(ar[i]!=0){
                for(int j=i+1;j<n;j++){
                    if(ar[j]!=0){
                        if(ar[i]==ar[j]){
                            c++;
                            ar[j]=0;
                            ar[i]=0;
                        }
                    }
                }

            }
        }
        return c;
    }
