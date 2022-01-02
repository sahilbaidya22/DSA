package gfg_recursion;
import java.util.*;
public class Path 
{
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Rows :- ");
	   int n = sc.nextInt();
	   System.out.println("Enter Columns :- ");
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
   	System.out.println("\nThe no. of paths from starting pt to last pt = " + path(n,m));
   }
   
   static int path(int n, int m)
   {
	   if(n == 1 || m == 1)
		   return 1;
	   return path(n, m-1) + path(n-1, m);
   }
}
