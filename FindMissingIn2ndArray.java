package gfg;
import java.util.*;
public class FindMissingIn2ndArray 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        int b[] = new int[100];
        System.out.println("Enter size of array 1 :- ");
     	int n = sc.nextInt();
     	System.out.println("Enter size of array 2 :- ");
     	int m = sc.nextInt();
     	System.out.println("Enter array 1 :- ");
     	for(int i=0; i<n; i++)
     	{
     		a[i] = sc.nextInt();
     	}
     	for(int r=0; r<m; r++)
     	{
     		b[r] = sc.nextInt();
     	}
     	System.out.println("Array 1 is :- ");
     	for(int l=0; l<n; l++)
     	{
       		System.out.print(a[l]+"\t");
     	}
     	
     	System.out.println("\nArray 2 is :- ");
     	for(int k=0; k<m; k++)
     	{
       		System.out.print(b[k]+"\t");
     	}
     	System.out.println();
     	System.out.println("Elements not present in 2nd Array are = ");
     	for (int i = 0; i < n; i++)
		{
     		int j;
			for (j = 0; j < m; j++)
			{
				if (a[i] == b[j])
				{
					break;
				}
			}
					
			if (j == m)
			{
				System.out.print(a[i] + " ");
			}
	
		}
	}
}
