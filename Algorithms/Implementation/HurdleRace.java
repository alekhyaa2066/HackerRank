public class Solution {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        int max=0;
        for(int i=0;i<height.length;i++){
            if(max<height[i]){
                max=height[i];
            }
        }
        if(max>k)
            return max-k;
        else
            return 0;

    }
