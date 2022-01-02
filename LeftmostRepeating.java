package gfg_string;
import java.util.*;
public class LeftmostRepeating 
{
	static int NO_OF_CHARS = 256;
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enetr String");
    	String str = sc.nextLine();
		int index = firstRepeating(str);
		if (index == -1)
			System.out.printf("Either all characters are distinct or string is empty");
		else
			System.out.printf("First Repeating character is = " + str.charAt(index));
		
    }

    static int firstRepeating(String str)
    { 
    	boolean visited[] = new boolean[NO_OF_CHARS];
    	for (int i = 0; i < NO_OF_CHARS; i++)
    	{
    		visited[i] = false;
    	}

    	int res = -1;
    	for (int i = str.length() - 1; i >= 0; i--)
    	{
    		if (visited[str.charAt(i)] == false)
    			visited[str.charAt(i)] = true;
    		else
    			res = i;
    	}

    		return res;
    	}
    
}
