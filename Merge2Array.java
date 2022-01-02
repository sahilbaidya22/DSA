package gfg_sorting;
import java.util.*;
public class Merge2Array
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        int b[] = new int[100];
        int c[] = new int[100];
      	System.out.println("Enter size of array 1 :- ");
     	int n = sc.nextInt();
     	System.out.println("Enter size of array 2 :- ");
     	int m = sc.nextInt();
     	System.out.println("Enter array 1 :- ");
     	for(int l=0; l<n; l++)
     	{
     		a[l] = sc.nextInt();
     	}
     	System.out.println("Array 1 is :- ");
     	for(int k=0; k<n; k++)
     	{
     		System.out.print(a[k]+"\t");
     	}
     	System.out.println("\nEnter array 2 :- ");
     	for(int l=0; l<m; l++)
     	{
     		a[l] = sc.nextInt();
     	}
     	System.out.println("Array 2 is :- ");
     	for(int k=0; k<m; k++)
     	{
     		System.out.print(a[k]+"\t");
     	}
     	
     	int i = 0, j = 0, k = 0;
        while (i<n && j<m)
        {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
     
        while (i < n)
            c[k++] = a[i++];
     
        while (j < m)
            c[k++] = b[j++];
    
        System.out.println("\nArray after merging :-");
        for (int r=0; r<(n+m); r++)
            System.out.print(c[r] + " ");
    }
}
