package gfg;
import java.util.*;
public class TwoPointer
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        System.out.println("Enter size of array :- ");
    	int n = sc.nextInt();
    	System.out.println("Enter array elements :- ");
    	for(int r=0; r<n; r++)
    	{
    	    a[r] = sc.nextInt();
    	}
    	System.out.println("Array is :- ");
    	for(int r=0; r<n; r++)
    	{
    		 System.out.print(a[r]+"\t");
    	}
    	System.out.println("\nEnter sum :- ");
    	int x = sc.nextInt();
    	
    	int i = 0, j = n-1;
    	while (i < j) 
    	{
    		if (a[i] + a[j] == x)
    		{
    			System.out.println("Pair found !!");
    		    System.out.println("At indexes :- "+(i+1)+" and "+(j+1));
    		    break;
    		}
 
            else if (a[i] + a[j] < x)
                i++;
 
            else
                j--;
        }  
    }
}
