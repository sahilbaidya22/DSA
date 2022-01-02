package gfg;
import java.util.*;
public class Forest
{
	static int wc(int a[], int n, int mid)
    {
        int s = 0;
        for(int i=n-1; i>=0; i--)
        {
            if(a[i] - mid <= 0)
            {
                break;
            }
            s = s + (a[i] - mid);
        }
        return s;
    }
    
	public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
      	System.out.println("Enter size of array :- ");
     	int n = sc.nextInt();
     	System.out.println("Enter array :- ");
     	for(int i=0; i<n; i++)
     	{
     		a[i] = sc.nextInt();
     	}
     	Arrays.sort(a);
     	System.out.println("Sorted array is :- ");
     	for(int k=0; k<n; k++)
     	{
     		System.out.print(a[k]+"\t");
     	}
     	System.out.println("\nEnter k :- ");
     	int k = sc.nextInt();
     	
     	int l=0, h = n-1;
        while(l <= h)
        {
            int mid = l + ((h - l)/2);
            int c = wc(a, n, mid);
            if(c == k)
            {
                System.out.println("\nOutput = "+mid);
            }
            if(c > k)
            {
                l = mid +1;
            }
            else
            {
            	h = mid - 1;
            }
        }
        if(l > h)
        {
        	System.out.println("Output not found ");
        }
    }
}
