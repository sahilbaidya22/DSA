package prog9;
import java.util.*;
public class Prims 
{
	public static void main(String args[])
	{
		int cost[][]=new int [10][10];
		int i,j,mincost=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of nodes :-");
		int n=sc.nextInt();
		System.out.println("Enter the cost matrix :-");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				cost[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nThe Cost Matrix is :-");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(cost[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\nMinimum Spanning Tree Edges and costs are :-\n");
		mincost=prims(cost,n,mincost);
		System.out.println("\nThe Minimum Spanning Tree Cost is = " +mincost);
		
	}
  
	static int prims(int cost[][],int n,int mincost)
	{
	   int nearV[]=new int[10], t[][]=new int[10][3],u=0,i,j,k;
	   for(i=2;i<=n;i++)
	   {
		   nearV[i]=1;
	   }
	   nearV[1]=0;
	   for(i=1;i<n;i++)
	   {
		   int min=999;
		   for(j=1;j<=n;j++)
		   {
			   if(nearV[j]!=0 && cost[j][nearV[j]]<min)
			   {
				   min=cost[j][nearV[j]];
				   u=j;
			   }
		   }
		   t[i][1] = u;
		   t[i][2] = nearV[u];
		   mincost += min;
		   nearV[u]=0;
		   for(k=1;k<=n;k++)
		   {
			   if(nearV[k]!=0 && cost[k][nearV[k]]>cost[k][u])
				   nearV[k]=u;
		   }
		   System.out.println(i+" Minimum edge is "+t[i][1]+","+t[i][2]+" and its cost is = "+min);
	   } 
	   return mincost;
	}
}