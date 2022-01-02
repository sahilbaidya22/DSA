package programs;
import java.util.*;
class Staff
{
	int staffid, salary;
	String name, phone;
	Staff(int staffid, int salary, String name, String phone) 
	{
		this.staffid = staffid; 	
		this.salary = salary;
		this.name = name;
		this.phone = phone;
	}
	void display()
	{
		System.out.print(staffid+"\t"+salary+"\t"+name+"\t"+phone+"\t");
	}
}

class Teaching extends Staff
{
	String domain, publication;
	Teaching(int staffid, int salary, String name, String phone, String dom, String pub)
	{
		super(staffid, salary, name, phone);
		domain = dom;
		publication = pub;
	}
	void displayTeach()
	{
		System.out.println(domain+"\t"+publication+"\t\t-\t-");		
	}
}

class Technical extends Staff
{
	String skills;
	Technical(int staffid, int salary, String name, String phone, String skill)
	{
		super(staffid, salary, name, phone);
		skills = skill;
	}
	void displayTech()
	{
		System.out.println("-\t"+"-\t\t"+skills+"\t-");
	}
	
}

class Contract extends Staff 
{
	int periods;
	Contract(int staffid, int salary, String name, String phone, int period)
	{
		super(staffid, salary, name, phone);
		periods = period;
	}
	void displayContract()
	{
		System.out.println("-\t-\t\t-\t"+periods);
	}
}

public class StaffDetails
{
	public static void main(String args[])
	{
		int  i;
		Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of Staffs in each category :-");
            int n=sc.nextInt();
			String name, phone, domain, publications, skills;
			int sid, salary ,periods;
			System.out.println("Teaching details");
			Teaching te[] = new Teaching[n];
				for(i=0; i<te.length; i++)
				{
					System.out.println("Enter sid, salary, name, phone, domain, and publication details");
					sid = sc.nextInt();
					salary = sc.nextInt();
					name = sc.next();
					phone = sc.next();
					domain = sc.next();
					publications = sc.next();
					te[i] = new Teaching(sid, salary, name, phone, domain, publications);
				}
		
				
               System.out.println("Technical details");
			    Technical tech[] = new Technical[n];
				for(i=0; i<tech.length; i++)
				{
					System.out.println("Enter sid, salary, name, phone, and skill details");
					sid = sc.nextInt();
					salary = sc.nextInt();
					name = sc.next();
					phone = sc.next();
					skills = sc.next();
					tech[i] = new Technical(sid, salary, name, phone, skills);
				}
		
			
             System.out.println("Contract details");
			    Contract tec[] = new Contract[n];
				for(i=0; i<tec.length; i++)
				{
					System.out.println("Enter sid, salary, name, phone, and period details");
					sid = sc.nextInt();
					salary = sc.nextInt();
					name = sc.next();
					phone = sc.next();
					periods = sc.nextInt();
					tec[i] = new Contract(sid, salary, name, phone, periods);
				}
		

				System.out.println("STAFFID\tSALARY\tNAME\tPHONE\t       DOMAIN\tPUBLICATION\tSKILLS\tPERIOD\n");
				int p,q,r;
			for(p=0;p<n;p++)
			{
				te[p].display();
				te[p].displayTeach();
			}
			for(q=0;q<n;q++)
			{
				tech[q].display();
				tech[q].displayTech();
			}
			for(r=0;r<n;r++)
			{
				tec[r].display();
				tec[r].displayContract();
			}
	 }
}
