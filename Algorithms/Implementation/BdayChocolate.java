public class Solution {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int c=0;
        for(int i=0;i<=s.size()-m;i++){
            int sum=s.get(i);
            //if(i+m<s.size())
                for(int j=i+1;j<(i+m);j++){
                    sum+=s.get(j);
                }
                if(sum==d){
                    c++;
                }
            sum=0;
        }
        return c;
    }