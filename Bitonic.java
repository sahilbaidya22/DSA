package gfg;
import java.util.*;
public class Bitonic
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
      	System.out.println("Enter size of array :- ");
     	int n = sc.nextInt();
     	System.out.println("Enter array :- ");
     	for(int i=0; i<n; i++)
     	{
     		arr[i] = sc.nextInt();
     	}
     	System.out.println("Array is :- ");
     	for(int k=0; k<n; k++)
     	{
       		System.out.print(arr[k]+"\t");
     	}
     	
		int l=1, h=n-2;	
	
		if (l <= h)
		{
			int mid = (l + h) / 2;
	
			if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
			{
				System.out.println ("\nMax = " + arr[mid]);
			}
				
			if (arr[mid] < arr[mid + 1])
			{
				l = mid + 1;
			}
			else
			{
				h = mid - 1;
			}
		}
	    
	}
}
