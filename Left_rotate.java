package gfg;
import java.util.*;
public class Left_rotate
{
    public static void main(String args[])
    {
    	int j=1,c=1,l=1;
    	Scanner sc = new Scanner(System.in);
    	int a[] = new int[20];
    	int t[] = new int[20];
    	int b[] = new int[20];
    	System.out.println("Enter size of array :- ");
    	int n = sc.nextInt();
    	System.out.println("Enter array :- ");
    	for(int i=1; i<=n; i++)
    	{
    		a[i] = sc.nextInt();
    	}
    	System.out.println("Array is :- ");
    	for(int i=1; i<=n; i++)
    	{
    		System.out.print(a[i]+"\t");
    	}
    	System.out.println("\nEnter D  :- ");
    	int d = sc.nextInt();
    	for(int k=1; k<=d; k++)
    	{
    		t[k] = a[k];
       	}
    	
    	for(int s=1; s<=n-d; s++)
    	{
    		b[c] = a[d+1];
    		c++;
    		d++;
    	}
    	
    	for(int r=c; r<=n; r++)
    	{
    		b[c] = t[l];
    		l++;
    	}
    	for(int f=1; f<=n; f++)
    	{
    		System.out.print(b[f]+"\t");
    	}
    }
}
