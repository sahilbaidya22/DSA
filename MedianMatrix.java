package gfg_matrix;
import java.util.*;
public class MedianMatrix
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter no.of rows =");
    	int n = sc.nextInt();
    	System.out.println("Enter no.of cloumns =");
    	int m = sc.nextInt();
    	int a[][] = new int[n][m];
    	int p = n*m;
    	int b[] = new int [p];
    	System.out.println("Enter Matrix elements :-");
    	for(int i=0; i<n; i++)
    	{
    		for(int j=0; j<m; j++)
    		{
    			a[i][j] = sc.nextInt();
    		}
    	}
    	System.out.println("The Matrix is :-");
    	for(int i=0; i<n; i++)
    	{
    		for(int j=0; j<m; j++)
    		{
    			System.out.print(a[i][j]+"\t");
    		}
    		System.out.println();
    	}
    	int k=0;
    	for(int r=0; r<n; r++)
    	{
    		for(int s=0; s<m; s++)
    		{
    			b[k] = a[r][s];
    			k++;
    		}
    	}
    	for(int x=0; x<p; x++) 
     	{
     		for(int z=0; z<(p-1); z++)
     		{
     			if(b[z] > b[z+1])
     			{
     				int temp = b[z];
     				b[z] = b[z+1];
     				b[z+1] = temp;
     			}
     		}
     	}
    	System.out.println("\nSorted array is - ");
     	for(int l=0; l<p; l++)
     	{
     		System.out.print(b[l]+"\t");
     	}
     	int index = (p-1)/2;
      	if(p%2 != 0)
    	{
        	System.out.println("\nMedian = "+b[index]);
    	}
      	else
      	{
      	    double y = (double)((b[index] + b[index+1])/2);
        	System.out.println("\nMedian = "+y);
      	}
    }
}