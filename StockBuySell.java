package gfg;
import java.util.*;

public class StockBuySell
{
   public static void main(String args[])
   {
	    int min, max=0,r=0;
	    Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
     	System.out.println("Enter size of array :- ");
     	int n = sc.nextInt();
     	System.out.println("\nEnter array elements :- ");
     	for(int i=1; i<=n; i++)
     	{
     		a[i] = sc.nextInt();
     	}
     	System.out.println("\nThe Array is :- ");
     	for(int i=1; i<=n; i++)
     	{
     		System.out.print(a[i]+"\t");
     	}
     	min = a[1];
     	
     	for(int j=1; j<=n; j++)
     	{
     		if(a[j] < min)
     		{
     			min = a[j];
     			r = j;
     		}
     	}
     	for(int k=r; k<=n; k++)
     	{
     		if(a[k] > max)
     		{
     			max = a[k];
     		}
     	}
     	if(max == 0)
     	{
     		System.out.println("\nProfit = 0");
     	}
     	else
     	{
     		System.out.println("\nProfit = "+(max-min));
     	}
   }
}
