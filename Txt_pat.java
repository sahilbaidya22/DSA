package gfg_string;
import java.util.*;
public class Txt_pat
{
	static int MAX = 256;
	
	static boolean compare(char arr1[], char arr2[])
	{
		for (int i = 0; i < MAX; i++)
			if (arr1[i] != arr2[i])
				return false;
		return true;
	}

	static void search(String pat, String txt)
	{
		int M = pat.length();
		int N = txt.length();

		char[] countP = new char[MAX];
		char[] countTW = new char[MAX];
		for (int i = 0; i < M; i++)
		{
			(countP[pat.charAt(i)])++;
			(countTW[txt.charAt(i)])++;
		}

		for (int i = M; i < N; i++)
		{
			if (compare(countP, countTW))
				System.out.println("Found at Index "+(i - M));
			
			(countTW[txt.charAt(i)])++;

			countTW[txt.charAt(i-M)]--;
		}

		if (compare(countP, countTW))
			System.out.println("Found at Index "+(N - M));
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text ");
		String txt = sc.nextLine();
		System.out.println("Enter pattern ");
		String pat = sc.nextLine();
		search(pat, txt);
	}
}