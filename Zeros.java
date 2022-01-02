package gfg;
import java.util.*;
public class Zeros 
{
    public static void main(String args[])
    {
    	int j=1,c=0;
    	Scanner sc = new Scanner(System.in);
    	int a[] = new int[20];
    	//int t[] = new int[20];
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
    	for(int k=1; k<=n; k++)
    	{
    		if(a[k] != 0)
    		{
    			a[j] = a[k];
    			j++;
    		}
    		else
    		{
    			c++;
    		}
    	}
    	for(int s=1; s<=c; s++)
    	{
    		a[j] = 0;
    		j++;
    	}
    	System.out.println("\nResult :- ");
    	for(int i=1; i<=n; i++)
    	{
    		System.out.print(a[i]+"\t");
    	}
    }
}
