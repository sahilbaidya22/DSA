package prog4;
import java.util.*;
public class Merge3Way
{
	public static void main(String args[])
	{
		int i=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements to be sorted ");
		n=sc.nextInt();   
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements to be sorted ");
		for(;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		mergesort(arr,0,n-1);
		System.out.println("Sorted elements are : ");
		for(i=0;i<n;i++)
			System.out.print(arr[i]+"\t");
		
	}

	static void mergesort(int[] arr, int low, int high) 
	{
	  int mid1, mid2;
	  if(low<high)
	  {
		  mid1=low+((high-low)/3);
		  mid2=low+ 2*((high-low)/3)+1;
		  mergesort(arr,low,mid1);
		  mergesort(arr,mid1+1,mid2);
		  mergesort(arr,mid2+1,high);
		  merge(arr,low,mid1,mid2,high);
	  }
	}
	 static void merge(int[] arr,int low,int mid1,int mid2, int high)
	 {
		 int i,j,k,h,p;
		 int b[]=new int[1000];
		 i=h=low;
		 j=mid1+1;
		 k=mid2+1;
		 
		 while((i<=mid1)&&(j<=mid2)&&(k<=high))
		 {
			 if(arr[i]<=arr[j])
			 {
				 if(arr[i]<=arr[k])
				 {
					 b[h]=arr[i];
					 h++;
					 i++;
				 }
				 else
				 {
					 b[h]=arr[k];
					 h++;
					 k++;
				 }
			 }
			 else
			 {
				 if(arr[j]<=arr[k])
				 {
					 b[h]=arr[j];
					 h++;
					 j++;
				 }
				 else
				 {
					 b[h]=arr[k];
					 h++;
					 k++;
				 }
			 }
		 }
		 
		 while((i<=mid1)&&(j<=mid2))
		 {
			 if(arr[i]<=arr[j])
			 {
				 b[h]=arr[i];
				 h++;
				 i++;
		     }
			 else
			 {
				 b[h]=arr[j];
				 h++;
				 j++;
			 }
		}
		 
	    while((j<=mid2)&&(k<=high))
	    {
	    	if(arr[j]<=arr[k])
	    	{
	    		b[h]=arr[j];
	    		h++;
	    		j++;
	    	}
	    	else
	    	{
	    		b[h]=arr[k];
	    		h++;
	    		k++;
	    	}
	    }
	    while((i<=mid1)&&(k<=high))
	    {
	    	if(arr[i]<arr[k])
	    	{
	    		b[h]=arr[i];
	    		h++;
	    		i++;
	    	}
	    	else
	    	{
	    		b[h]=arr[k];
	    		h++;
	    		k++;
	    	}
	    }
	    while(i<=mid1)
	    {
	    	b[h]=arr[i];
	    	h++;
	    	i++;
	    }
	    while(j<=mid2)
	    {
	    	b[h]=arr[j];
	    	h++;
	    	j++;
	    }
	    while(k<=high)
	    {
	    	b[h]=arr[k];
	    	h++;
	    	k++;
	    }
	    for(p=low;p<=high;p++)
	    {
	    	arr[p]=b[p];
	    }
	 }
}