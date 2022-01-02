package gfg;
import java.util.*;
public class Sorted 
{
    public static void main(String args[])
    {
    	int i,j,asc=0,dec=0;
    	int a[] = new int[20];
    	Scanner sc = new Scanner(System.in);
    	//Random r = new Random(10);
    	System.out.println("Enter no.of elements :- ");
    	int n = sc.nextInt();
    	System.out.println("Enter array element :- ");
       	for(i=1; i<=n; i++ ) 
	    	a[i] = sc.nextInt();
	    System.out.println("Array elements are :- ");
	    for(j=1; j<=n; j++ ) 
	    	System.out.println(a[j]);
	    for(int s=0; s<n-1; s++)
	    {
	    	if(a[s] < a[s+1])
	    		asc++;
	    	else
	    		break;
	    }
	    for(int k=0; k<n-1; k++)
	    {
	    	if(a[k] > a[k+1])
	    		dec++;
	    	else
	    		break;
	    }
	    if(asc == n-1)
	    	System.out.println("Array sorted in ascrending order");
	    else if(dec == n-1)
	    	System.out.println("Array sorted in decending order");
	    else
	    	System.out.println("Array not sorted");
   	}
}
