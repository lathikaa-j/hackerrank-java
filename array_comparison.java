import java.util.*;
public class Solution
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
    int [] aarr = new int [3];
    int [] barr = new int [3];
    int ra=0;
    int rb=0;
    for(int i=0; i<3;i++)
        aarr[i] = sc.nextInt();
    
    for(int i=0; i<3;i++)
        barr[i] = sc.nextInt();
    for(int i=0;i<3;i++)
    {
        if(aarr[i]>barr[i])
            ra= ra+1;
        else if(aarr[i]<barr[i])
            rb= rb+1;
        else
            ra = ra+0;
            rb=rb+0;
    }
    System.out.println(ra+" "+rb);
  }
}
