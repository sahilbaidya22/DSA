package gfg_matrix;
import java.util.*;
public class MatrixSnake
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter no.of rows =");
    	int n = sc.nextInt();
    	System.out.println("Enter no.of cloumns =");
    	int m = sc.nextInt();
    	int a[][] = new int[n][m];
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
    	System.out.println("Matrix in snake pattern :-");
    	for(int i=0; i<n; i++)
    	{
    		if(i%2 == 0)
    		{
    			for(int j=0; j<m; j++)
        		{
        			System.out.print(a[i][j]+"\t");
        		}
    		}
    		else
    		{
    			for(int j=m-1; j>=0; j--)
        		{
        			System.out.print(a[i][j]+"\t");
        		}
    		}
    		
    	}
    }
}
