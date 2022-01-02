package prog1;
import java.util.*;
class twoStacks
{
  int arr[];
  int max_size;
  int t1, t2;
 
  twoStacks(int s)
  {
    max_size = s;
    arr = new int[s];
    t1 = s / 2 + 1;
    t2 = s / 2;
  }
 
  void push1(int elem)
  {
    if (t1 > 0)
    {
      t1--;
      arr[t1] = elem;
    }
    else
    {
      System.out.print("Stack Overflow \n");
      return;
    }
  }

  void push2(int val)
  {
    if (t2 < max_size - 1)
    {
      t2++;
      arr[t2] = val;
    }
    else
    {
      System.out.print("Stack Overflow \n");
      return;
    }
  }
  int pop1()
  {
    if (t1 <= max_size / 2)
    {
      int x = arr[t1];
      t1++;
      return x;
    }
    else
    {
      System.out.print("Stack UnderFlow\n");
      System.exit(1);
    }
    return 0;
  }
 
  int pop2()
  {
    if (t2 >= max_size / 2 + 1)
    {
      int x = arr[t2];
      t2--;
      return x;
    }
    else
    {
      System.out.print("Stack UnderFlow");
      System.exit(1);
    }
    return 1;
  }
  void display1()
  {
	  while(t1 <= max_size / 2)
	    {
		  System.out.println("Stack 1 Elements");
		  System.out.println(+ arr[t1]);
	      t1++;
	    }
  }
  void display2()
  {
	  while(t2 >= max_size / 2 + 1)
	    {
		  System.out.println("Stack 2 Elements");
		  System.out.println(+ arr[t2]);
	      t2--;
	    }
  }
}
class Arrays
{
 
  public static void main(String[] args)
  {
	  int n,ch,e1,e2;
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number of elements to be inserted in stack");
	  n=sc.nextInt();
    twoStacks ss = new twoStacks(n);
    for(;;)
    {
    	System.out.println("-------MENU-------\n");
    	System.out.println("1. Push in Stack 1\n2. Pop from Stack 1\n3. Push in Stack 2\n4. Pop from Stack 2\n5. Display Stack 1\n6. Display Stack 2\n7. Exit ");
    	System.out.println("Enter your choice\n");
    	ch=sc.nextInt();
    	switch(ch)
    	{
    	case 1: System.out.println("Enter the element to be inserted in Stack 1\n");
    	        e1=sc.nextInt();
    	        ss.push1(e1);
    	        break;
    	case 3: System.out.println("Enter the element to be inserted in Stack 2\n");
    	        e2=sc.nextInt();
    	        ss.push2(e2);
    	        break;
    	case 2: System.out.println("Popped element from stack 1 is "+ss.pop1()+"\n");
    	        break;
    	case 4: System.out.println("Popped element from stack 2 is "+ss.pop2()+"\n");
    	        break;
    	case 5 : ss.display1();        
    	         break;
    	case 6 : ss.display2();
    	         break;
    	        
    	case 7 : System.exit(0);
    	
    	default: System.out.println("Invalid Choice !!!");
    	}
    }
  }
}