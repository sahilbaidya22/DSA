package gfg_sorting;
import java.util.*;
public class BubbleSort
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
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
     	for(int r=0; r<n; r++) 
     	{
     		for(int j=0; j<n-1; j++)
     		{
     			if(a[j] > a[j+1])
     			{
     				int temp = a[j];
     				a[j] = a[j+1];
     				a[j+1] = temp;
     			}
     		}
     	}
     	System.out.println("\nSorted array is - ");
     	for(int l=0; l<n; l++)
     	{
     		System.out.print(a[l]+"\t");
     	}
    }
}
