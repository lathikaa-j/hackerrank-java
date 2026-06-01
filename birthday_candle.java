import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int sum =0;
        int [] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]= s.nextInt();
        int max = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
                max = arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]== max)
                sum= sum+1;
        }
        System.out.println(sum);
    }
}
