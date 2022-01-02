package prog6;
import java.util.*;

class GreedyKnapsack
{
	int n,m;
	int []w;
	int []p;
	
	public GreedyKnapsack(int n,int m,int []w,int []p)
	{
		this.n=n;
		this.m=m;
		this.w=w;
		this.p=p;
	}
	
	public void greedy()
	{
		float sum=0,max;
		int i,j=0;
		while(m>=0)
		{
			max=0;
	
			for(i=0;i<n;i++)
			{
				if(((float)p[i])/((float)w[i])>max)
				{
					max=((float)p[i])/((float)w[i]);
					j=i;
				}
			}
			if(w[j]>m)
			{
				System.out.println("Quantity of item number: "+(j+1)+" added is "+ (float)m/w[j]);
				sum=sum+m*max;
				m = -1;
			}
			else
			{
				System.out.println("Quantity of item number: "+(j+1)+" added fully ");
				m = m - w[j];
				sum=sum+(float)p[j];
				p[j] = 0;
			}	
		}
		System.out.println("The total profit is : "+sum);
	}
}

public class KnapsackGreedy
{
    public static void main(String args[])
    {
    	int i,max_qty,n;
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	int w[]=new int[10];
    	int p[]=new int[10];
    	System.out.println("Enter no. of items : ");
    	n=sc.nextInt();
    	System.out.println("Enter the weights of each items : ");
    	for(i=0;i<n;i++)
    		w[i]=sc.nextInt();
    	System.out.println("Enter the profit of each items : ");
    	for(i=0;i<n;i++)
    		p[i]=sc.nextInt();
    	System.out.println("Enter the knapsack capacity : ");
    	max_qty=sc.nextInt();
    	GreedyKnapsack gk=new GreedyKnapsack(n, max_qty, w, p);
    	gk.greedy();
    }
}