public class Solution {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        int n=a.length;
        int c=0;
        String s="YES";
        String y="NO";
        for(int i=0;i<n;i++){
            if(a[i]<=0)
                c++;
        }
        if(c>=k)
            return y;
        else
            return s;

    }
