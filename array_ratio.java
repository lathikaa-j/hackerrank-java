import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr= new int[n];
        int p=0;
        int q=0;
        int z=0;
        for(int i=0;i<n;i++ )
        {
            arr[i]= s.nextInt();
            if(arr[i]>0)
                p++;
            else if(arr[i]<0)
                q++;
            else
                z++;
        }
        double rp = (double) p/n;
        double rn= (double) q/n;
        double rz= (double) z/n;
        System.out.printf("%.6f",rp);
        System.out.println();
        System.out.printf("%.6f",rn);
        System.out.println();
        System.out.printf("%.6f",rz);
    }
}
