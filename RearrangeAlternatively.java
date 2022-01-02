package gfg;
import java.util.*;
public class RearrangeAlternatively 
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        int temp[] = new int[20];
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
     	
     	for(int j=0; j<n; j++)
     	{
     		temp[j] = a[j];
     	}
     	
        int x = 0, y = n - 1;
        boolean flag = true;
        
        for(int z = 0; z < n; z++) 
        {
            if (flag)
                a[z] = temp[y--];
            else
                a[z] = temp[x++];
 
            flag = !flag;
        }
        System.out.println("Rearranges array :-");
        for(int j=0; j<n; j++)
     	{
     	    System.out.print(a[j]+"  ");
     	}
    }
}
