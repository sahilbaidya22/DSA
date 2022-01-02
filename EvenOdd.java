package gfg;
import java.util.*;
public class EvenOdd
{
    public static void main(String args[])
    {
    	int m = 0;
    	Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
     	System.out.println("Enter size of array :- ");
     	int n = sc.nextInt();
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
     	
     	int l=1,c=1;
        for (int j = 0; j < n-1; j++)
        {
            if ((a[j] + a[j + 1]) % 2 == 1)
            {
                c++;
            }
            else
            { 
                l = Math.max(l, c);
                c = 1;
            }
        }
        // if(l != 1)
        {
        	m = Math.max(c,l);
        	System.out.print("\nOutput = "+m);
        }
        
        System.out.print("\n\nThe Subarray is = ");
        for(int k=0; k <= m-1 ; k++)
        {
        	System.out.print(a[m]);
        }
    }
}
    
