import java.util.*;
import java.lang.String;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int e = s.length();
        boolean p = true;
        for(int i =0 ; i<e/2;i++)
        {
                if (s.charAt(i)!= s.charAt(e-1-i))
                {
                    p= false;
                    break; 
                }    
        }
        if(p)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
