package assignment;
import java.util.*;
public class armstrong
{
   public static void main(String args[])
   {
       int n, temp, s = 0, r;
       Scanner sc=new Scanner(System.in);
       System.out.println("\nEnter a number to find if it's an Armstrong or not :- ");
       n=sc.nextInt();
       
       temp = n;
       while(temp!=0)
       {
           r = temp % 10;
           s = s + (r * r * r);
           temp = temp / 10;
       }
       if(n == s)
       {
    	   System.out.println("\n" + n + " is an Armstrong number !!");
       }
       else
       {
    	   System.out.println( "\n" + n + " is not an Armstrong number !!");
       }
       sc.close();
   }
    
}