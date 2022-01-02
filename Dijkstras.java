package prog7;
import java.util.*;
public class Dijkstras
{
      public static void main(String args[])
      {
    	 
    	  int i,j;
    	  int cost[][]=new int[15][15];
    	  int dist[]=new int[15];
    	  int visited[]=new int[15];
    	  int path[]=new int[15];
    	  Scanner sc=new Scanner(System.in);
    	  
    	  System.out.println("Enter the number of nodes ");
    	  int n=sc.nextInt();
    	  System.out.println("Enter the Cost Matrix ");
    	  for(i=1;i<=n;i++)
    	  {
    		  for(j=1;j<=n;j++)
    		  {
    			  cost[i][j]=sc.nextInt();
    		  }
    	  }
    	  
    	  System.out.println("The Cost Matrix ");
    	  for(i=1;i<=n;i++)
    	  {
    		  for(j=1;j<=n;j++)
    		  {
    			  System.out.print(cost[i][j] + "\t");
    		  }
    		System.out.println();
    	  }
    	  
    	  System.out.println("Enter the Source Vertex ");
    	  int sv=sc.nextInt();
    	  dij(cost,dist,sv,n,path,visited);
    	  printpath(sv,n,dist,path,visited);
      }
      
     
	static void dij(int cost[][], int dist[], int sv, int n, int path[], int visited[])
	{
		int count=2, min, v = 0;
		for(int i=1;i<=n;i++)
		{
			visited[i]=0;
			dist[i] = cost[sv][i];
			
			if(cost[sv][i]==999)
				path[i]=0;
			else
				path[i]=sv;	
		}
		visited[sv]=1;
		
		while(count<=n)
		{
			min=999;
			for(int u=1;u<=n;u++)
			{
				if((dist[u]<min)&&(visited[u]==0))
				{
					min=dist[u];
					v=u;
				}
			}
			visited[v]=1;
			count++;
			
			for(int u=1;u<=n;u++)
			{
				if((dist[u])>(dist[v]+cost[v][u]))
				{
					dist[u]=dist[v]+cost[v][u];
					path[u]=v;
				}
						
			}
				
		}
	}
	
	static void printpath(int sv,int n,int dist[],int path[],int visited[])
	{
		for(int u=1;u<=n;u++)
		{
			if(visited[u]==1 && u!=sv)
			{
				System.out.print("\nThe shortest distance between ");
				System.out.println(sv+"->"+u+" is "+dist[u]);
				int t=path[u];
				System.out.print("The path is: ");
				System.out.print(" "+u);
				while(t!=sv)
				{
					System.out.print(" <-- "+t);
					t=path[t];
				}
				System.out.print(" <-- "+sv);
			}
		}
	}
}
