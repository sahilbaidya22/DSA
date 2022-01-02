package assignment;
import java.util.*;
public class Queues
{

	static int size;
	int queue[] = new int[size];
	static int front, rear;
	Queues()
	{
		front = -1;
		rear = -1;
	}
	boolean isFull()
	{
		if(front == 0 && rear == size-1)
			return true;
		else
			return false;
	}
	boolean isEmpty()
	{
		if(front == -1)
			return true;
		else
			return false;
	}
	void enQueue(int elem)
	{
		if(isFull())
			System.out.println("\nQueue is Full !!!");
		else
		{
			if(front == -1)
			{
				front = 0;
			}
			queue[++rear] = elem;
			System.out.println("\nInserted Element :- " + elem);
		}
	}
	int deQueue()
	{
		int item;
		if(isEmpty())
		{
			System.out.println("\nQueue is Empty !!!");
			return -1;
		}
		else
		{
			item = queue[front];
			if(front >= rear)
			{
				front = -1;
				rear = -1;
			}
			else
			{
				front++;
			}
			System.out.println("\nDeleted Element :- " + item);
			return item;
		}
	}
	void display()
	{
		if(isEmpty())
		{
			System.out.println("\nEmpty Queue !!!");
		}
		else
		{
			System.out.println("\nFront -> " + front);
			System.out.print("\nElements in Queue :- \n");
			int i;
			for(i = front; i <= rear; i++)
 			{
				System.out.print("\n" + queue[i] + "    ");
			}
			System.out.println("\nRear -> " + rear);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Size of the Queue :- ");
        size = sc.nextInt();
        Queues q = new Queues();
        int ch;
        while(true)
        { 
        	System.out.println("\n----MENU----\n");
        	System.out.println("1. Insert\n2. Delete\n3. Display\n4. Exit\n");
        	ch = sc.nextInt();
        	switch(ch)
        	{
        	case 1: System.out.println("\nEnter Element to be inserted :- ");
        	        int e = sc.nextInt();
        	        q.enQueue(e);
        	        break;
        	case 2: q.deQueue();
        	        break;
        	case 3: q.display();
        	        break;
        	case 4: System.exit(0);
        	        break;
        	default : System.out.println("\nInvalid Choice !!!");
        	}
        }
	}

}
