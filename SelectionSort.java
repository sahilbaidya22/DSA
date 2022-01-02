package gfg_sorting;
import java.util.*;
public class SelectionSort 
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
     	for (int i = 0; i < n-1; i++)
        {
            int m = i;
            for (int j = i+1; j < n; j++)
                if (a[j] < a[m])
                    m = j;
 
            int temp = a[m];
            a[m] = a[i];
            a[i] = temp;
        }
     	System.out.println("\n Sorted Array is :- ");
     	for(int r=0; r<n; r++)
     	{
     		System.out.print(a[r]+"\t");
     	}
    }
}
