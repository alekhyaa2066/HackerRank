public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        String a="Cat A";
        String b="Cat B";
        String c="Mouse C";
        int c1=Math.abs(z-x);
        int c2=Math.abs(z-y);
        if(c1>c2){
            return b;
        }
        else if(c1==c2){
            return c;
        }
        else{
            return a;
        }


    }
