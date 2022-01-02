package gfg;
import java.util.*;
public class Sort012
{
    public static void main(String args[])
    {
    	int c1 = 0, c2 = 0, c3 = 0;
        
    	Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        int x[] = new int[20];
     	System.out.println("Enter size of array :- ");
     	int n = sc.nextInt();
     	System.out.println("Enter proper array :- ");
     	for(int i=0; i<n; i++)
     	{
     		a[i] = sc.nextInt();
     	}
     	System.out.println("The Array is :- ");
        for(int i=0; i<n; i++)
      	{
             System.out.print(a[i]+"\t");
        }
        System.out.println();        
        for (int j = 0; j < n; j++)
      	{
             switch (a[j])
             {
                  case 0: c1=c1+1;
                          break;
                                 
                  case 1: c2=c2+1;
                          break;
                                 
                  case 2: c3=c3+1;
                          break;
             }
         }
        int z=0;
         System.out.println("Sorted array :-");
         while (c1 > 0)
         {
             a[z++] = 0;
             c1--;
         }
      
         while (c2 > 0)
         {
             a[z++] = 1;
             c2--;
         }
      
         while (c3 > 0) 
         {
             a[z++] = 2;
             c3--;
         }
         for(int i=0; i<n; i++)
         {
        	 System.out.print(a[i]+"   ");
         }
     		
    }
}
