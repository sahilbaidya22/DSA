package gfg;
import java.util.*;
public class Duplicate
{
    public static void main(String args[])
    {
    	int l=1;
    	Scanner sc = new Scanner(System.in);
    	int a[] = new int[20];
    	int t[] = new int[20];
    	System.out.println("Enter size of sorted array :- ");
    	int n = sc.nextInt();
    	System.out.println("Enter a sorted array :- ");
    	for(int i=1; i<=n; i++)
    	{
    		a[i] = sc.nextInt();
    	}
    	System.out.println("Sorted array is :- ");
    	for(int i=1; i<=n; i++)
    	{
    		System.out.print(a[i]+"\t");
    	}
    	for(int j=1; j<=n; j++)
    	{
    		if(j!=n)
    		{	
    		    if(a[j] != a[j+1])
       		    {
    			    t[l] = a[j];
    			    l++;
    		    }
    		}
    		else
    		{
    			t[l] = a[j];
    		}
    	}
    	System.out.println("\nArray without Duplicates");
    	for(int k=1; k<=l; k++)
    	{
    		System.out.print(t[k]+"\t");
    	}
    }
}
