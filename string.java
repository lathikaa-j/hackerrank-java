import java.lang.String;
import java.util.*;

public class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        int sum= a.length()+b.length();
        System.out.println(sum);
        int res= a.compareTo(b);
        if(res>0)
            System.out.println("Yes");
        else
            System.out.println("No");
        String cap1 = Character.toUpperCase(a.charAt(0))+a.substring(1);
        String cap2 = Character.toUpperCase(b.charAt(0))+b.substring(1);
        System.out .println(cap1+ " "+cap2);  
        }
}
