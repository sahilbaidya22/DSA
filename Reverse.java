package gfg;
import java.util.*;
public class Reverse
{
	public static void main(String arg[])
	{
		int i,j,r,swap,mid,k;
  	    int a[] = new int[20];
		Scanner sc = new Scanner(System.in);
		Random rr = new Random(5);
	    System.out.println("Enter array size :- ");
	    int n = sc.nextInt();
	  
	    for(i=1; i<=n; i++ ) 
	    	a[i] = rr.nextInt(100);
	    System.out.println("Array elements are :- ");
	    for(j=1; j<=n; j++ ) 
	    	System.out.println(a[j]);
	    
	    if(n%2==0)
		{
		    mid=n/2;
		    j=mid-1;
		    k=mid;
		   for(i=0;i<n/2;i++)
		   {
			  swap=a[j];
			  a[j]=a[k];
			  a[k]=swap;
			  j--;
			  k++;
		   }
		}
		else
		{
			mid=n/2;
			j=mid-1;
			k=mid+1;
			for(i=0;i<n/2;i++)
			{
				swap=a[j];
				a[j]=a[k];
				a[k]=swap;
				j--;
				k++; 
			}
		}
	    
	    	
	    
	    System.out.println("Reverse Array elements are :- ");
	    for(i=1; i<=n; i++)
	    {
	    	System.out.println(a[i]);
	    }
    }
}