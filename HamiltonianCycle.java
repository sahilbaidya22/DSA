package prog12;
import java.util.*;
public class HamiltonianCycle
{
	 static int x[] = new int[25];
	 static boolean flag = false;
     public static void main(String args[])
     {
    	 int i,j,n;
    	 int G[][] = new int[25][25];
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the number of Vertices of the graph");                      
    	 n = sc.nextInt();
    	 System.out.println("Enter the Path adjacency matrix ");
    	 for(i=1;i<=n;i++)
    	 {
    		 for(j=1;j<=n;j++)
    		 {
    			 G[i][j]=sc.nextInt();
    			 x[i]=0;
    		 }
    	 }
    	 x[1]=1;
    	                  
    	 H_Cycle(G,n,2); 
    	 if(flag==false)
    		 System.out.println("\nHamiltonian Cycle is not present !!!");
     }
     
     static void H_Cycle(int G[][],int n,int k)
     {
    	 while(true)
    	 {
    		 next_vertex(G,n,k);
    		 
    		 if(x[k]==0)
    			 return;
    		 if(k==n)
    		 {
    			 flag=true;
    			 System.out.print("\nHamiltonian Cycle :\t");
    			 for(int i=1;i<=n;i++)
    				 System.out.print(x[i]+"-->");
    			 System.out.println(x[1]);
    		 }
    		 else
    		 {
    			 H_Cycle(G,n,k+1);
    		 }
    	 }
     }
     
     static void next_vertex(int G[][], int n, int k)
     {
    	 int j;
    	 while(true)
    	 {
    	  x[k]=(x[k]+1)%(n+1);
    	
    	  
    	  if(x[k]==0)
    		 return;
    	 
    	  if(G[x[k-1]][x[k]]!=0)
    	  {
    		 for(j=1;j<=k-1;j++)
    		 {
    			 if(x[j]==x[k])
    				 break;
    		 }
    		 
    		 if(j==k)
    		 {
    			 if((k<n)||(k==n)&&(G[x[n]][x[1]]!=0))
    			 {
    				 return;
    			 }	 
    		}
    	  }
    	}
     }
}