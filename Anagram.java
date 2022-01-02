package gfg_string;
//import java.io.*;
import java.util.*;
//import java.util.Arrays;
//import java.util.Collections;
public class Anagram
{
    public static void main(String args[])
    {
    	int flag = 1;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter string 1 ");
    	String s1 = sc.nextLine();
    	System.out.println("Enter string 2 ");
    	String s2 = sc.nextLine();
    	System.out.println("String 1 is = "+s1);
    	System.out.println("String 2 is = "+s2);
    	int n1 = s1.length();
        int n2 = s2.length();
        
        if (n1 != n2)
        {
        	System.out.println("\nNot an anagram !!");
        }
        else
        {
        	System.out.println(n1 + " , " + n2);
        	char str1[] = s1.toCharArray();
            char str2[] = s2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            System.out.println("\nString 1 = ");
            for (int i = 0; i < n1; i++) 
            {
              	System.out.print(str1[i]+"\t");
            }
            System.out.println("\nString 2 = ");
            for (int j = 0; j < n2; j++) 
            {
            	System.out.print(str2[j]+"\t");
            }
            for (int k = 0; k < n1; k++) 
            {
                if (str1[k] != str2[k])
                {
                	flag = 1;
                	break;
                }
                else
                {
                	flag = 0;
                }
            }
            if(flag == 0)
            {
            	System.out.println("\n\nIt is an anagram !!");
            }
            else
            {
              	System.out.println("\nNot an anagram !!");
            }
        }
    }
}
