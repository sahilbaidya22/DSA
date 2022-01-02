package prog1;
import java.util.*;
public class Stack
{
	static int size;
	static int stack[];
	static int top;
	public Stack(int s)
	{
		size=s;
		stack = new int[size];
		top=-1;
	}
	
	public static void push(int elem)
	{
		stack[++top]=elem;
	}
	
	public static int pop()
	{
		return stack[top--];
	}
	
	public static void display()
	{
		if(isempty())
			System.out.println("Stack is empty!!");
		else
		{
			System.out.println("Stack elements are :");
			for(int i=top;i>=0;i--)
				System.out.println(stack[i]+"\t");
			System.out.println("\n");
		}
	}
	
	public static boolean isempty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public static boolean isfull()
	{
		if(top==(size-1))
			return true;
		else
			return false;
	}
	
	public static class Array
	{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the stack");
			int n=sc.nextInt();
			Stack st=new Stack(n);
			for(;;)
			{
				System.out.println("MENU");
				System.out.println("-----\n");
				System.out.print("1.Push\n2.Pop\n3.Display\n4.Exit\n");
				System.out.println("Enter your choice");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1: if(st.isfull())
					       System.out.println("Stack is Full");
				        else
				        {
				        	System.out.println("Enter the element");
				        	int value=sc.nextInt();
				        	st.push(value);
				        }
			        	break;
				case 2: if(st.isempty())
					    System.out.println("Stack is Empty");
				        else
				        {
					     int k=st.pop();
					     System.out.println("Popped element is "+k+"\n");
				        }
			        	break;
				case 3: display();
				        break;
				case 4: System.out.println("Terminating!!!!");
					    System.exit(0);
				default: System.out.println("Invalid Choice!!");
				}
			}
		}
	}
}