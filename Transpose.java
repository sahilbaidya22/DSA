package gfg_matrix;
import java.util.*;
public class Transpose
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter no.of rows =");
    	int n = sc.nextInt();
    	System.out.println("Enter no.of cloumns =");
    	int m = sc.nextInt();
    	int a[][] = new int[n][m];
    	int b[][] = new int[n][m];
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
    	
    	for(int r=0; r<n; r++)
    	{
    		for(int s=0; s<m; s++)
    		{
    			b[r][s] = a[s][r];
    		}
    		System.out.println();
    	}
    	System.out.println("Transpose Matrix is :-");
    	for(int r=0; r<n; r++)
    	{
    		for(int s=0; s<m; s++)
    		{
    			System.out.print(b[r][s]+"\t");
    		}
    		System.out.println();
    	}
    }
}