package gfg;
import java.util.*;
public class Leaders
{
    public static void main(String args[])
    {
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
    	System.out.println();
    	System.out.println("The Leaders are :-");
    	int max = a[n];
    	System.out.print(max+"\t");
    	for(int j=n-1; j>=1; j--)
    	{ 		
    			if(a[j] > max)
    			{
    				max = a[j];
    				System.out.print(max+"\t");
    			}    			
    	}
    }
}
