package assignment;
import java.util.*;
public class StringReverse 
{
	public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("\nEnter a String to be Reversed :- ");
    	String str = "";
    	String n = sc.nextLine();
    	
    	int i = 0, len = n.length();
    	
    	for(i = len-1; i >= 0; i--)
    	{
    		str = str + n.charAt(i);
    	}
    	System.out.println("\nReversed String = " + str);
    }
}

