package prog5;
import java.util.*;
import java.util.Random;
public class QuickSort 
{

	public static void main(String args[])
	{
		int i;
		long start,end;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements to be sorted ");
		int n=sc.nextInt();
		Random r=new Random();
		int arr[]=new int[10000]; 
		for(i=0;i<n;i++)
		{
			arr[i]=r.nextInt(10000);
		}
		System.out.println("\nArray elements to be sorted are : ");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		arr[n]=99999;
		start=System.nanoTime();
		quicksort(arr,0,n-1);
		end=System.nanoTime();
	
		System.out.println("\n\nThe sorted elements are : ");
		for(i=0;i<n;i++)
			System.out.print(arr[i]+"\t");
		System.out.println("\n\nThe time taken to sort the elements is : " +(end-start)+ " ns");
		
	}
	
	static void quicksort(int arr[], int p, int q)
	{
		int j;
		if(p<q)
		{
			j=partition(arr,p,q);
			quicksort(arr,p,j-1);
			quicksort(arr,j+1,q);
		}
	}
	
	static int partition(int arr[],int l, int r)
	{
		int i,j;
		int p=arr[l];
		i=l;
		j=r;
		while(i<=j)
		{
			while(arr[i]<=p)
			{
				i++;				
			}
			while(arr[j]>p)
			{
				j--;
			}
			if(i<j)
			{
				interchange(arr,i,j);
			}
		}
		arr[l]=arr[j];
		arr[j]=p;
		return j;
		}
	static void interchange(int arr[],int i,int j)
	{
		int p;
		p=arr[i];
		arr[i]=arr[j];
		arr[j]=p;
	}
}