package gfg;
import java.util.*;
public class SquareRoot
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number");
    	int n = sc.nextInt();
    	System.out.println("Enter precision");
    	int p = sc.nextInt();
    	
    	int start = 0, end = n;
    	int mid;
    	
    	int ans=0;
    	 
    	while (start <= end)
    	{
    	     mid = (start + end) / 2;
    	     if (mid * mid == n)
    	     { 
    	          ans = mid;
    	          break;
      	     }
      
    	     if (mid * mid < n)
    	     {
    	          start = mid + 1;
    	          ans = mid;
    	     }
    	     else
    	     {
    	          end = mid - 1;
    	     }
    	}
    	 
    	
    	System.out.println("Answer = "+ans);
    }
}
