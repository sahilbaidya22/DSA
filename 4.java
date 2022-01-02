package assignment;
import java.util.*;
public class SimpleCalculator 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter 2 Numbers to perform operations :- ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        while(true)
        {
        	System.out.println("---SIMPLE CALCULATOR---\n");
            System.out.println("Enter '1' for Additition.");
            System.out.println("Enter '2' for Subtraction.");
            System.out.println("Enter '3' for Multiplication.");
            System.out.println("Enter '4' for Division.");
            System.out.println("Enter '5' to Exit.\n");
            System.out.println("Enter Your Choice :- ");
            
            char ch = sc.next().charAt(0);
            switch(ch)
            {
                case '1' : System.out.println("\nAddition :- " +a+" + "+b+" = "+(a+b)+"\n");
                           break;
                case '2' : System.out.println("\nSubtraction :- "+a+" - "+b+" = "+(a-b)+"\n");
                           break;
                case '3' : System.out.println("\nMultiplication :- "+a+" * "+b+" = "+(a*b)+"\n");
                           break;
                case '4' : if(b==0)
                           {
                	           System.out.println("\nDenominator cannot be zero !!");
                           }
                           else
                           {
                	           System.out.println("\nDivision :- "+a+" / "+b+" = "+((float)a/(float)b)+"\n");
                           }
                           break;
                case '5' : System.out.println("Terminating !!");
         	               System.exit(0);
                           break;
                default  : System.out.println("Invalid Choice !! ");       
            }          
        }
   	}
}
