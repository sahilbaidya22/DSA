package gfg;
import java.util.*;
public class Circular_subarray
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
     	int wrapsum, nonwrapsum, sum = 0;
     	nonwrapsum = kadane(a,n);
     	for(int k=0; k<n; k++)
     	{
     		sum = sum + a[k];
     		a[k] = -a[k];
     	}
     	wrapsum = sum + kadane(a,n);
     	System.out.println("\nMax sum = "+Math.max(wrapsum,nonwrapsum));
    }
    static int kadane(int a[], int n)
    {
    	int cursum = 0;
     	int maxsum = 0;
     	for(int i=0; i<n; i++)
     	{
     		cursum = cursum + a[i];
     		if(cursum <0)
     			cursum = 0;
     		maxsum = Math.max(maxsum,cursum);
     	}
     	return maxsum;
    }
}
