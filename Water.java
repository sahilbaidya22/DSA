package gfg;
import java.util.*;
public class Water 
{
    public static void main(String args [])
    {
    	int cap = 0;
    	Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
       	System.out.println("Enter size of array :- ");
     	int n = sc.nextInt();
     	int l[] = new int[n];
        int r[] = new int[n];
     	System.out.println("\nEnter array elements :- ");
     	for(int i=0; i<n; i++)
     	{
     		a[i] = sc.nextInt();
     	}
     	System.out.println("\nThe Array is :- ");
     	for(int i=0; i<n; i++)
     	{
     		System.out.print(a[i]+"\t");
     	}
     	
     	l[0] = a[0];
        for (int i = 1; i < n; i++)
        {
            l[i] = Math.max(l[i - 1], a[i]);
        }
 
        r[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--)
        {
        	r[i] = Math.max(r[i + 1], a[i]);
        }
        
        for (int i = 0; i < n; i++) 
        {
            cap = cap + Math.min(l[i], r[i]) - a[i];
        }
        
        System.out.println("\nWater stored = "+cap+" units");
    }
}
