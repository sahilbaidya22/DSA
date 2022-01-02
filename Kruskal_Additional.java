package prog8;
import java.util.*;

public class Kruskal_Additional 
{
    static int parent[] = new int[20];
    static int i,j, noe = 1, u, v, a, b, min, mincost = 0;
    static int adjmat[][] = new int[20][20];
    static int degree[] = new int[20];
    
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes ");
        int n = sc.nextInt();

        System.out.println("Enter the adjacency matrix");
        for (i = 1; i<=n; i++)
        {
            for (j =1; j<=n; j++)
            {
                adjmat[i][j] = sc.nextInt();
            }
        }

        System.out.println("The entered adjacency matrix is :");
        for(i = 1; i<=n; i++)
        {
        	degree[i] = 0;
            for(j = 1; j<=n; j++)
            {
                System.out.print(adjmat[i][j] + "\t");
                if(adjmat[i][j] == 1) 
                {
                	degree[i]++;
                }
            }
            System.out.println();
        }
        
        
        int max = 0;
        for(int i = 1; i<=n; i++)
        {
        	System.out.println("Degree of vertex " +  i + " = "+degree[i]);
        	if(degree[i] > max)
        	{
        		max = degree[i];
        	}
        }
    	System.out.println("Maximum Degree in the given graph= "+ max + "\n");
    	


        while(noe < n)
        {
            for(i = 1; i<=n; i++)
            {
            	
            	if(degree[i] == max && noe < n )
            	{
                	System.out.println("\nNode " + i + " has degree "  + max+"\n");

            		 for (j=1; j<=n; j++)
            		 {
                         if(adjmat[i][j] != 0)
                         {
                             a = u = i;
                             b = v = j;
                             u = find(u);
                             v = find(v);
                             union();
                             degree[i] = 0;
                         }
                     }
            		
            	}
            	
            }
            max--;
       }
    }
    

    static int find(int w)
    {
        while(parent[w] != 0)
        {
            w = parent[w];
        }
        return w;
    }

    static void union()
    {
        if(u != v)
        {
            noe++;
            System.out.println(noe-1 + "Edge(" + a + ", " + b + ")");
            mincost += min;
            parent[v] = u;
        }
        adjmat[a][b] = adjmat[b][a] = 999;
    }
}