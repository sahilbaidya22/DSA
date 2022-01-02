package prog4;
import java.util.*;
import java.util.Random;
public class MergeSort 
{

	public static void main(String args[])
	{
		
		int a[]=new int[10000];
		int i;
		long start,end;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements to be sorted");
		int n=sc.nextInt();
		Random r=new Random(10);
		for( i=0;i<n;i++)
		{
			a[i]=r.nextInt(10000);
		}
		System.out.println("\nArray elements to be sorted are :- ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		start=System.nanoTime();
		mergesort(a,0,n-1);
		end=System.nanoTime();
		
		System.out.println("\n\nThe sorted elements are :- ");
		for(i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		
		System.out.println("\n\nThe time taken to sort the elements is :- " +(end-start)+ "ns");
		
	}

	 static void mergesort(int[] a, int low, int high)
	 {
	  	int mid;
	  	if(low<high)
	  	{
	  		mid=(low+high)/2;
	  		mergesort(a,low,mid);
	  		mergesort(a,mid+1,high);
	  		merge(a,low,mid,high);
	  	}
		
	 }
	 
	 static void merge(int a[], int low, int mid, int high)
	 {
		 int i,j,k,h;
		 int b[]=new int[10000];
		 
		 h=low;
		 i=low;
		 j=mid+1;
		 
		 while((h<=mid)&&(j<=high))
		 {
			 if(a[h]<=a[j])
			 {
				 b[i]= a[h];
				 h=h+1;
			 }
			 else
			 {
				 b[i]=a[j];
				 j=j+1;
			 }
			 i=i+1;
		 }
		 
		 if(h>mid)
		 {
			 for(k=j;k<=high;k++)
			 {
				 b[i]=a[k];
				 i=i+1;
			 }
		 }
		 else
		 {
			 for(k=h;k<=mid;k++)
			 {
				 b[i]=a[k];
				 i=i+1;
			 }
		 }
		 
		 for(k=low;k<=high;k++)
			 a[k]=b[k];
	 }
}