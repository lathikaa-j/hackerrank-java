import java.util.*;
import java.text.*;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double p = sc.nextDouble();
        Locale india = new Locale("en","IN");
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat ind = NumberFormat.getCurrencyInstance(india);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: "+ us.format(p));
        System.out.println("India: "+ ind.format(p));
        System.out.println("China: "+ ch.format(p));
        System.out.println("France: "+ f.format(p));
             
    }
}
