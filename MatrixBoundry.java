package gfg_matrix;
import java.util.*;
public class MatrixBoundry
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
    	System.out.println("\nThe Matrix Boundry is :-");
    	for(int i=0; i<n; i++)
    	{
    		if(i == 0 || i == (n-1))
    		{
    			for(int j=0; j<m; j++)
        		{
        			System.out.print(a[i][j]+"\t");
        		}
    		}

    		else
    		{
    			for(int j=0; j<m; j++)
        		{
        			if(j == 0 || j == (m-1))
        			{
        				System.out.print(a[i][j]+"\t");
        			}
        			else
        			{
        				System.out.print("\t");
        			}
        		}
    		}
    		System.out.println();
    	}
    }
}