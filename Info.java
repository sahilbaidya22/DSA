package prog1;
import java.util.Scanner;

class Student
{
	 String USN, Name, Branch, Phone;
	 public Student(String usn, String name, String branch,String phone)
	 {
		 USN=usn;
		 Name=name;
		 Branch=branch;
		 Phone=phone;
	 }
}

public class Info
{

	public static void main(String[] args)
	{
		
		int i;
		String usn, name, branch, phone,k;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of students");
	    int n=sc.nextInt();
	    Student[] st= new Student[n];
	    for(i=0;i<n;i++)
	    {
		    System.out.println("Enter detail of Student "+(i+1));
		    System.out.println("Enter Student's USN");
		    usn=sc.next();
		    k=sc.nextLine();
		    System.out.println("Enter Student's Name");
		    name=sc.nextLine();
		    System.out.println("Enter Student's Branch");
		    branch= sc.next();
		    System.out.println("Enter Student's Phone Number");
		    phone= sc.next();
		 
		    st[i]=new Student(usn,name,branch,phone);
	    }
	     System.out.println("Students details are :-");
	     System.out.println("-----------------------");
	     System.out.println("Sl.No            USN              NAME                BRANCH              PHONE NUMBER   ");
	     for(i=0;i<n;i++)
	     {
		     
	    	 System.out.print((i+1)+"                ");
		     System.out.print(st[i].USN +"       ");
		     System.out.print(st[i].Name +"          ");
		     System.out.print(st[i].Branch +"                ");
		     System.out.print(st[i].Phone +"            "+"\n");
	     }
	}
}