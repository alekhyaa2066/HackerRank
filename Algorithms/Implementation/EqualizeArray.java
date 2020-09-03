public class Solution {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        
        int a[]=new int[arr.length];
        int max=0;
        for(int i=0;i<arr.length;i++){
            int c=0;            
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(max<c) max=c;
        }
        return arr.length-max;
    }
