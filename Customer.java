package programs;
import java.util.*;
import java.util.StringTokenizer;
public class Customer
{
   public static void main(String args[])
   {
      Customer read = new Customer(); 
      String customerName = read.NameDob(); 
      read.display(customerName);
   }
   String NameDob()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter name and DOB in <name,dd/mm/yyyy> format"); 
      String str = sc.next();
      if(!str.startsWith("<") || !str.endsWith(">"))
      {
         System.out.println("Please enter the details in proper format");
      }
      return str;
   }
   void display(String detail) 
   
   {
      String st = detail.substring(0, detail.length());
      StringTokenizer stringTokenizer = new StringTokenizer(st, "<,/>"); 
      String result =null;
      while(stringTokenizer.hasMoreTokens())
      {
         if(result == null)
         {
            result = stringTokenizer.nextToken();
         }
         else
         {
            result =result+","+stringTokenizer.nextToken();
         }
      }
         System.out.println("<"+result+">");
   }
}