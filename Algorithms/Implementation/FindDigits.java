public class Solution {

    // Complete the findDigits function below.
    static int findDigits(int n) {
        int c=0;
        int k=n;
        int a=0;
        while(k>0){
            a=k%10;
            if(a!=0){
                if(n%a==0)
                    c++;
                k=k/10;
                a=0;
            }
            else{
                k=k/10;
            }
        }
        return c;
    }