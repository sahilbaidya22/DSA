package gfg;
import java.util.*;

public class Second_Largest 
{
	public static void main(String arg[])
	{
		int i,j,r,s,l,z;
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
	    
	    l = a[1];
	    for(r=1; r<=n; r++)
	    {
	    	if(l < a[r])
	    	{
	    		l = a[r];
	    	}
	    }
	    
	    z = a[1];
	    for(s=1; s<=n; s++)
	    {
	    	if(z <= a[s] && a[s] < l)
	    	{
	    		z = a[s];
	    	}
	    }
	    System.out.println("2nd Largest no. is :- " + z);
   	}
}
