package gfg_sorting;
import java.util.*;
public class InsertionSort
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
      	System.out.println("Enter size of array :- ");
     	int n = sc.nextInt();
     	System.out.println("Enter array :- ");
     	for(int l=0; l<n; l++)
     	{
     		a[l] = sc.nextInt();
     	}
     	System.out.println("Array is :- ");
     	for(int k=0; k<n; k++)
     	{
     		System.out.print(a[k]+"\t");
     	}
     	
     	for (int i = 1; i < n; ++i)
     	{
            int key = a[i];
            int j = i - 1;
 
            while (j >= 0 && a[j] > key)
            {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
     	System.out.println("\nSorted Array is = ");
     	for(int k=0; k<n; k++)
     	{
     		System.out.print(a[k]+"\t");
     	}
    }
}
