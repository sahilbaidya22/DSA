package gfg;
import java.util.*;
public class Max_subarray
{
    public static void main(String args[])
    {
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
     	int cursum = 0;
     	int maxsum = 0;
     	for(int i=0; i<n; i++)
     	{
     		cursum = cursum + a[i];
     		if(cursum <0)
     			cursum = 0;
     		maxsum = Math.max(maxsum,cursum);
     	}
     	
     	System.out.println("\nmaxsum = "+maxsum);
    }
}
