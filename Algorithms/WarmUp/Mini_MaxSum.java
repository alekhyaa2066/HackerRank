public class Solution{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int k=0;
        long sum1=0;
        long sum2=0;
        long a[]=new long[5];
        for(int i=0;i<5;i++)
        {
            a[i]=s.nextLong();

        }
        Arrays.sort(a);
        for(int i=0;i<4;i++)
        {
            sum1=sum1+a[i];
        }
        for(int i=1;i<=4;i++)
        {
            sum2=sum2+a[i];
        }
        System.out.println(sum1+" "+sum2);
    }
}
