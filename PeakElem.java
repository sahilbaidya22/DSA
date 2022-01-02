package gfg;
import java.util.*;
public class PeakElem
{
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
       int A[] = new int[100];
       System.out.println("Enter size of array :- ");
   	   int N = sc.nextInt();
   	   System.out.println("Enter array elements :- ");
   	   for(int r=0; r<N; r++)
   	   {
   		   A[r] = sc.nextInt();
   	   }
   	   System.out.println("Array is :- ");
   	   for(int r=0; r<N; r++)
   	   {
   		   System.out.print(A[r]+"\t");
   	   }
   	  if (N == 1)
   		  System.out.print("\nIndex of a peak point is 0 ");
      if (A[0] >= A[1])
    	  System.out.print("\nIndex of a peak point is 0 ");
      if (A[N - 1] >= A[N - 2])
    	  System.out.print("\nIndex of a peak point is " + (N-1));
    
      for(int i = 1; i < N-1; i++)
      {
          if (A[i] >= A[i - 1] && A[i] >= A[i + 1])
          {
        	  System.out.print("\nIndex of a peak point is " + i);
        	  break;
          }
      }
   }
}
