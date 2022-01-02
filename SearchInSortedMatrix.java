package gfg_matrix;
import java.util.*;
public class SearchInSortedMatrix
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
    	System.out.println("Enter x");
    	int x = sc.nextInt();
    	int i = 0, j = n - 1;
        
        while (i < n && j >= 0)
        {
            if (a[i][j] == x)
            {
                System.out.print(x+" Found at ( " + (i+1) + "," + (j+1)+" )");
            }
            if (a[i][j] > x)
                j--;
            else 
                i++;
        }
//        if(i>n || j<0) 
//        {
//        	System.out.print("n Element not found");
//        }
        
    }
}