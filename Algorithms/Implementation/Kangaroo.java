public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String s="YES";
        String n="NO";
        int k1=x1+v1;
        int k2=x2+v2;
        int flag=0;
        for(int i=0;i<10000;i++){
            if(k1==k2){
                flag=1;
                break;
            }
            else{
                k1+=v1;
                k2+=v2;
            }
        }
        if(flag==1){
            return s;
        }
        else{
            return n;
        }
    }
