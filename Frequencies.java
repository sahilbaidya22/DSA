package gfg;
import java.util.*;
public class Frequencies
{
    public static void main(String args[])
    {
    	int c=0;
    	Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
      	System.out.println("Enter size of sorted array :- ");
      	int n = sc.nextInt();
      	System.out.println("\nEnter sorted array :- ");
      	for(int i=1; i<=n; i++)
      	{
      		a[i] = sc.nextInt();
      	}
      	System.out.println("\nThe sorted array is :- ");
      	for(int i=1; i<=n; i++)
      	{
      		System.out.print(a[i]+"\t");
      	}
      	System.out.println("\nEnter the number to check frequencie :- ");
      	int z = sc.nextInt();
      	for(int j=1; j<=n; j++)
      	{
      		if(z == a[j])
      			c++;
      	}
      	if(c!=0)
      		System.out.println("\nFrequency of "+z+" is :- "+c);
      	else
      		System.out.println("\nEntered number "+z+" doesnt exist in array !!");
      	
    }
}
