package gfg;
import java.util.*;

public class SubarrayGivenSum
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
     	System.out.println("Enter size of array :- ");
     	int n = sc.nextInt();
     	System.out.println("Enter array :- ");
     	for(int i=1; i<=n; i++)
     	{
     		a[i] = sc.nextInt();
     	}
     	System.out.println("Array is :- ");
     	for(int k=1; k<=n; k++)
     	{
     		System.out.print(a[k]+"\t");
     	}
     	System.out.println("\n\nEnter Sum = ");
     	int s = sc.nextInt();
     	
     	int curr=0;
     	for (int i = 0; i < n; i++) 
     	{
            curr = a[i];
   
            for (int j = i + 1; j <= n; j++)
            {
                 if (curr == s)
                 {
                      int p = j - 1;
                      System.out.println("\nSum found between indexes "+i+" and "+p);
                      System.out.println("\nConsist of elements :- ");
                      for(int r=i; r<=p; r++)
                      {
                    	  System.out.print(a[r]+"\t");
                      }
                 }
                 if (curr > s || j == n) 
                 {
                	 System.out.println("No subarray found");
                	 break;
                 }
                  
                 curr = curr + a[j];
             }
         }             
    }
}
