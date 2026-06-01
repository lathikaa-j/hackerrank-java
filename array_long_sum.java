import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        long sum =0;
        int [] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= s.nextInt();
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
