package programs;
import java.util.*;
public class StringsRearrange
{
	public static void main(String args[]) 
	{
		read s = new read();
		s.read();
		s.frequency();
		s.display();
	}
}
class read
{
	String str;
	int n;
	int m =0;
	Scanner sc = new Scanner(System.in);
	public void read() 
	{
		System.out.println("Enter a string to rearrange");
		str = sc.next();
		n = str.length();	
	}
	public void frequency()
	{
		int freq[] = new int[26];
		for(int i=0;i<str.length();i++) 
		{
			char ch = str.charAt(i);
			freq[ch-'a']++;
			if(freq[ch-'a'] > m)
				m = freq[ch-'a'];
		}
		
	}
	public void display() 
	{
		char strng[] = str.toCharArray();
		if(m > (str.length() - m + 1))
		{
			System.out.println("Not possible");
			System.exit(0);
		}
		char temp;
		for(int i=0,k=i+1;i<str.length();i++,k++) 
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(strng[i] != strng[j]) 
				{
					if(j != i+1) 
					{
						temp = strng[k];
						strng[k] = strng[j];
						strng[j] = temp;
					}
					break;
				}
			}
		}
		System.out.println("The Original String : " +str);
		System.out.print("The Rearranged string is :");
		for(int i=0;i<str.length();i++)
			System.out.print(strng[i]);
	}
}
