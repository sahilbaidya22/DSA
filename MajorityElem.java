package gfg;
import java.util.*;
public class MajorityElem
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
     	System.out.println();
     	
        int max = 0;
        int z = 0;
        for(int k = 0; k < n; k++)
        {
            int c = 0;
            for (int j = 0; j < n; j++)
            {
                if (a[k] == a[j])
                    c++;
            }
 
            if (c > max)
            {
                max = c;
                z = k;
            }
        }
 
        if (max > n / 2) 
        {
        	System.out.println("Majority elements is :-");
        	System.out.println(a[z]);
        }
        
        else
            System.out.println("No Majority Element");
    }
}
