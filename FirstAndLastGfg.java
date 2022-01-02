package gfg;
import java.util.*;
public class FirstAndLastGfg
{
    static int first(int arr[], int x, int n)
    {
        int low = 0, high = n - 1,
	    res = -1;
        while (low <= high)
        {
	    	int mid = (low + high) / 2;
	        if (arr[mid] > x)
	        {
	        	high = mid - 1;
	        }
	        else if (arr[mid] < x)
	        {
	        	low = mid + 1;
	        }
        	else
	        {
	            res = mid;
	            high = mid - 1;
	        }
        }
        return res;
    }
    
    static int last(int arr[], int x, int n)
    {
        int low = 0, high = n - 1,
	    res = -1;
        while (low <= high)
        {
	    	int mid = (low + high) / 2;
        	if (arr[mid] > x)
        	{
        		high = mid - 1;
        	}
	        else if (arr[mid] < x)
	        {
	        	low = mid + 1;
	        }
         	else
	        {
	            res = mid;
	            low = mid + 1;
	        }
        }
        return res;
    }

    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
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
     	System.out.println("\nEnter x :- ");
     	int x = sc.nextInt();
     	
     	System.out.println("First Occurrence = " + first(arr, x, n));
        System.out.println("Last Occurrence = " + last(arr, x, n));
    }
}

