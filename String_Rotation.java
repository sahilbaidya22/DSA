package gfg_string;
import java.util.*;
public class String_Rotation
{
	static boolean areRotations(String str1, String str2)
	{
		return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
	}
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 ");
		String str1 = sc.nextLine();
		System.out.println("Enter String 2");
		String str2 = sc.nextLine();
		if (areRotations(str1, str2))
			System.out.println("Strings are rotations of each other");
		else
			System.out.printf("Strings are not rotations of each other");
	}
}