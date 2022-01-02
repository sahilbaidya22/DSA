package gfg;
import java.util.*;
public class BinarySearch
{
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
     	System.out.println("Array is :- ");
     	for(int k=0; k<n; k++)
     	{
     		System.out.print(a[k]+"\t");
     	}
     	
    	System.out.println("\n\nEnter search element :- ");
     	int x = sc.nextInt();
        int l=0, h=n-1;
        int mid = (l + h)/2;  
     	while( l <= h )
     	{  
     	    if ( a[mid] < x )
     	    {  
     		     l = mid + 1;     
     		}
     	    else if ( a[mid] == x )
     	    {  
     	    	System.out.println("Element is found at index: " + (mid+1)); 
     		    break;
     		}
     	    else
     	    {  
     		     h = mid - 1;  
     		}  
     		
     	    mid = (l + h)/2;  
     	}  
     	 
     		 
    }
}
     		
