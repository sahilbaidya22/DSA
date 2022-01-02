package prog3;
import java.util.*;
public class Subarray
{
 	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size of the array_1 ");
	   int a=sc.nextInt();
	   int arr1[]=new int[a];
	   int i=0;
	   System.out.println("Enter the elements of array_1");
	   for(i=0; i<a; i++)
	   {
		   arr1[i]=sc.nextInt();
	   }
	   System.out.println("Enter the size of array_2");
	   int n=sc.nextInt();
	   int arr2[]=new int[n];
	   int j=0;
	   System.out.println("Enter the elements of array_2");
	   for(j=0; j<n; j++)
	   {
		   arr2[j]=sc.nextInt();
	   }
	   int count=0;
	   for(i=0;i<a;i++)
	   {
		   for(j=0; j<n; j++) 
		   {
			   if(arr1[i] == arr2[j])
			    	  count++;
		   }
	   }
	   if(count==n)
		   System.out.println("Array_2 is a subset of Array_1 !!");
	   else
		   System.out.println("Array_2 is not a subset of Array_1 !!");
	}
}
