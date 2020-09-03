public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int h=0;
        int v=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='U'){
                h++;
                if(h==0){
                    v++;
                }
            }
            else{
                h--;
            }
        }
        return v;
    }
