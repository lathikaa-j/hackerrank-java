import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int q = sc.nextInt();
        for(int i =0;i<q;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int s=a;
            for(int j=0;j<n;j++)
            {
                int p = (int) Math.pow(2,j);
                s = s+(p*b);
                System.out.printf("%d ",s);
            }
            System.out.println();
        }
    }
}
