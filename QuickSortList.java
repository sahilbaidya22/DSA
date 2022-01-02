package prog5;
import java.util.*;
public class QuickSortList
{
    static class Node
    {
        int data;
        Node link;
 
        Node(int d)
        {
            this.data = d;
            this.link = null;
        }
    }
 
    Node head;
 
    void addNode(int data)
    {
        if (head == null) 
        {
            head = new Node(data);
            return;
        }
 
        Node curr = head;
        while (curr.link != null)
            curr = curr.link;
 
        Node newNode = new Node(data);
        curr.link = newNode;
    }
 
    void display(Node h)
    {
        while (h!= null)
        {
            System.out.print(h.data+"\t");
            h = h.link;
        }
    }
 
    Node paritionLast(Node left, Node right)
    {
        if ((left == right) || (left== null) || (right == null))
            return left;
 
        Node pivot_prev = left;
        Node curr = left;
        int pivot = right.data;
 
           while (left != right)
           {
            if (left.data < pivot)
            {
                pivot_prev = curr;
                int temp = curr.data;
                curr.data = left.data;
                left.data = temp;
                curr = curr.link;
            }
            left = left.link;
        }
 
        int temp = curr.data;
        curr.data = pivot;
        right.data = temp;
 
        return pivot_prev;
    }
 
    void quicksort(Node left, Node right)
    {
        if(left == null || left == right|| left == right.link )
            return;
 
        Node pivot_prev = paritionLast(left,right);
        quicksort(left, pivot_prev);
 
        if (pivot_prev != null && pivot_prev == left)
            quicksort(pivot_prev.link, right);
 
        if (pivot_prev != null && pivot_prev.link != null)
            quicksort(pivot_prev.link.link, right);
    }
 

    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
        QuickSortList ll= new QuickSortList();
        System.out.println("Enter the number of elements to be sorted ");
        int num=sc.nextInt();
        System.out.println("Enter "+num+" elements to be sorted ");
        int i,a;
        for(i=0;i<num;i++)
        {
        	a=sc.nextInt();
        	ll.addNode(a);
        }
        Node r = ll.head;
        while (r.link != null)
            r = r.link;
 
        System.out.println("\nLinked List before sorting");
        ll.display(ll.head);
 
        ll.quicksort(ll.head, r);
 
        System.out.println("\n\nLinked List after sorting");
        ll.display(ll.head);
      
    }
}