package gfg;
import java.util.*;
public class InfiniteArray
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
     	System.out.println("Enter size of array :- ");
    	int n = sc.nextInt();
    	System.out.println("Enter sorted array :- ");
    	for(int r=0; r<n; r++)
    	{
    		a[r] = sc.nextInt();
    	}
    	System.out.println("Array is :- ");
    	for(int r=0; r<n; r++)
    	{
    		System.out.print(a[r]+"\t");
    	}
    	System.out.println("\nEnter key :- ");
    	int key = sc.nextInt();

    	int l = 0, h = 1;
    	int val = a[0];
    	      
        while (val < key)
    	{
    	    l = h;     
    	    if(2*h < a.length-1)
    	    {
    	     	h = 2*h;   
    	    }         
    	    else 
    	    {
    	        h = a.length-1;
    	    }
    	             
    	    val = a[h]; 
    	}
    	int mid = (l + h)/2;  
        while( l <= h )
     	{  
     	    if ( a[mid] < key )
     	    {  
     		     l = mid + 1;     
     		}
     	    else if ( a[mid] == key )
     	    {  
     	    	System.out.println("Element is found at index: " + mid); 
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
