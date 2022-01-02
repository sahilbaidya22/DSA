package prog3;
import java.util.*;
public class Compute
{
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the numerator");
	  int nume = sc.nextInt();
	  System.out.println("Enter th denominator");
	  int deno = sc.nextInt();
	  Compute c= new Compute();
	  try
	  {
	   c.Divide(nume,deno);
	  }
	  catch (Exception e)
	  {
		System.out.println("Error !!\nDenominator cannot be 0 ");
	  }
    }
    public void Divide(int n,int d) throws Exception
    {
	  float div;
	  div=n/d;
	  System.out.println("Division of "+ n +"/"+d+" = "+div);
    }
}
