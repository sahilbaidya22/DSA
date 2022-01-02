package prog10;
import java.util.*;
public class Floyd 
{
	public static void main(String args[])
	{
		int i,j, a[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("** Floyd's Algorithm ** \n");
		System.out.println("Enter the number of vertices ");
		int n=sc.nextInt();
		System.out.println("Enter adjacency matrix ");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered adjacency matrix ");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		floydalgo(a,n);
		
		System.out.println("\nAll Pair Shortest Path Matrix \n");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	static void floydalgo(int a[][],int n)
	{
		int i,j,k;
		for(k=1;k<=n;k++)
		{
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=n;j++)
				{
					a[i][j] = min(a[i][j],a[i][k]+a[k][j]); 
				}
			}
		}
	}
	
	static int min(int a,int b)
	{
		if(a<b)
			return a;
		else
			return b;
	}

}