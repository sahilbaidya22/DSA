package assignment;
import java.util.*;
public class GeneratePrime 
{
     public static void main(String args[])
     {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("\nEnter value of N :-\n");
    	 int n = sc.nextInt();
    	 int i, j, count;
    	 System.out.println("\nPrime Numbers between 1 to "+n+" are :-\n");
    	 for(i = 2; i <= n; i++)
    	 {
    		 count = 0;
    		 for(j = 1; j <= i; j++)
    		 {
    			 if(i % j == 0)
    			 count ++;
    		 }
    		 if(count == 2)
    		 {
    			System.out.print(i+"\t");
    		 }
    	 }
     }
}
