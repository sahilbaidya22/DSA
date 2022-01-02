package gfg_string;
import java.util.*;
public class String_palindrome 
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter String");
		String s = sc.nextLine();
    	char str[] = s.toCharArray();	
		int l = 0;
    	int h = s.length() - 1;
    	System.out.println("\nString  = ");
        for (int i = 0; i <= h; i++) 
        {
           	System.out.print(str[i]+"\t");
        }
        for(l=0,h=s.length()-1; h>=l; l++,h--)
   		{
    		if(str[l] != str[h])
   			{
   				System.out.println("\n"+s+" is not palindrome");
   				break;
    		}
      	}
        
    	if(h < l)
    	{
    	   System.out.println("\n"+s+" is palindrome");
    	}
    }
}
