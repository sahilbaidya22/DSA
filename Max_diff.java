package gfg;
import java.util.*;
public class Max_diff
{
    public static void main(String args[])
    {
    	int max = 0;
    	Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
      	System.out.println("Enter size of array :- ");
      	int n = sc.nextInt();
      	System.out.println("Enter array :- ");
      	for(int i=1; i<=n; i++)
      	{
      		a[i] = sc.nextInt();
      	}
      	System.out.println("Array is :- ");
      	for(int i=1; i<=n; i++)
      	{
      		System.out.print(a[i]+"\t");
      	}
      	int z = a[1];
      	for(int j=2; j<=n; j++)
    	{ 		
    			if(a[j] > max)
    			{
    				max = a[j];
       			}    			
    	}
      	int diff = max - z;
      	System.out.println("\nMaximum Difference is = "+diff);
    }
}
