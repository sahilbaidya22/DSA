package prog10;
import java.util.*;
public class TravellingSalesmanProblem 
{
   public static void main(String args[])
   {
	   int c[][] = new int[10][10], tour[] = new int[10];
	   Scanner sc = new Scanner(System.in);
	   System.out.println("** Traveling Salesman Problem ** \n");
	   System.out.println("Enter the number of cities ");
	   int i,j,n = sc.nextInt();
	   if(n == 1)
	   {
		   System.out.println("Path is not possible ");
		   System.exit(0);
	   }
	   System.out.println("Enter distance between cities ");
	   for(i=1; i<=n; i++)
	   {
		   for(j=1; j<=n; j++)
		   {
			   c[i][j] = sc.nextInt();
		   }
	   }
	   System.out.println("Entered distance between cities: ");
	   for(i=1; i<=n; i++)
	   {
		   for(j=1; j<=n; j++)
		   {
			   System.out.print(c[i][j]+"\t");
		   }
		   System.out.println();
	   }
	   for(i=1; i<=n; i++)
	   {
		   tour[i] = i;
	   }
	    
	   int cost = tsp(c,tour,1,n);
	   
	   System.out.println("\nThe accurate path is ");
	   for(i=1; i<=n; i++)
		   System.out.print(tour[i] +"-->");
	   System.out.println("1");
	   System.out.println("The Minimum distance for tour is: " +cost);
	   
   }
   
   static int tsp(int c[][],int tour[], int start, int n)
   {
	   int i, j, k, ccost, mincost = 999, mintour[] = new int[10];
	   int[] temp=new int[10];
	   if(start == n-1)                                      
	   {
		   return(c[tour[n-1]][tour[n]] + c[tour[n]][1]);
	   }
	   
	   for(i = start+1; i<=n; i++)
	   {
		   for(j=1; j<=n; j++) 
		   {
			   temp[j] = tour[j];
		   }
		   
		   temp[start+1] = tour[i];
		   temp[i] = tour[start+1];
		   
		   if(c[tour[start]][tour[i]] + (ccost = tsp(c,temp,start+1,n)) < mincost)
		   {
			   mincost = c[tour[start]][tour[i]] + ccost;

			   for(k=1; k<=n; k++) 
			   {
				   mintour[k] = temp[k];
			   }
		   }
	   }
	   for(i=1; i<=n; i++)
		  tour[i] = mintour[i];
		   
	   return mincost;
			   
	  
   }
}