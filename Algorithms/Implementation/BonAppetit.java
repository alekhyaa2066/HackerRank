public class Solution {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int s=0;
        String a="Bon Appetit";
        for(int i=0;i<bill.size();i++){
            s+=bill.get(i);
        }
        s=s-bill.get(k);
        int x=s/2;
        if(b>x)
            System.out.println(b-x);
        else
            System.out.println(a);

    }
