package gfg;
import java.util.*;

public class LastOcurr
{
   public static void main(String args[])
   {
	    Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
     	System.out.println("Enter size of array :- ");
    	int n = sc.nextInt();
    	System.out.println("Enter array :- ");
    	for(int r=0; r<n; r++)
    	{
    		a[r] = sc.nextInt();
    	}
    	System.out.println("Array is :- ");
    	for(int r=0; r<n; r++)
    	{
    		System.out.print(a[r]+"\t");
    	}
    	System.out.println("\nEnter x :- ");
    	int x = sc.nextInt();
    	System.out.println("\nSorted array is -");
    	for (int i = 0; i < n; i++)   
    	{  
    	    for (int j = i + 1; j < n; j++)   
    	    {  
    	         int tmp = 0;  
    	         if (a[i] > a[j])   
    	         {  
    	              tmp = a[i];  
    	              a[i] = a[j];  
    	              a[j] = tmp;  
    	         }  
    	    }  
    	    System.out.print(a[i]+"\t");  
    	}
    	int c = 0;
        boolean f = false;
        for (int i = 0; i < n; i++) 
        {
            if (a[i] == x) 
            {
                f = true;
            }
            else if (a[i] > x) 
            {
                c++;
            }
        }
        if(f == false)
        	System.out.println("\nElement not found");
        else
        	System.out.println("\nLast Ocurrence of "+x+" is at pos = "+c);
   }
}
