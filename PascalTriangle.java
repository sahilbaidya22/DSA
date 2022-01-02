package gfg_recursion;
import java.util.*;
public class PascalTriangle 
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
 	   System.out.println("Enter Rows :- ");
 	   int r = sc.nextInt();
 	   System.out.println("Pascal Triangle :-");
 	   for(int i = 0; i < r; i++)
 	   {
           for(int j = 0; j <= i; j++) 
           {
               System.out.print(pascal(i, j) + " ");
           }
           System.out.println();
       }
 	   System.out.println("Enter the Nth row = ");
 	   int n = sc.nextInt();
 	   System.out.println(" Output = ");
 	   for(int k = 0; k <= n; k++) 
       {
           System.out.print(pascal(n, k) + " ");
       }
    }
    public static int pascal(int i, int j) 
    {
        if (j == 0 || j == i)
        {
           return 1;
        }
        else
        {
           return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }
}
