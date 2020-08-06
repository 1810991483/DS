import java.util.*;
class Node {
  int data;
  Node next;
  Node(){}
  Node(int d) {
    data=d; next=null;
  }
}

class Main
{
  static Node insertEnd(Node head, int data)
  {
    Node newLink = new Node(data);
    Node last = head;
    newLink.next = null;   
    if (head == null)  
    {
      head = newLink;
      return head;
    }
    while (last.next != null)  
      last = last.next;
    last.next = newLink;  
    return head;
  }

  static void forwardPrint(Node head)
  {
    Node current = head; 
    while(current != null) 
    {
      System.out.print(current.data + " "); 
      current = current.next; 
    }
  }
  public static void main(String[] args)
  {
    int t,n,m,x;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0)
    {
      Node head = null;
      Node newHead = null;
      n = s.nextInt();
      while(n>0)
      {
        m = s.nextInt();
        head = insertEnd(head, m);
        n--;
      }
      newHead = Result.reverseList(head);
      forwardPrint(newHead);
      System.out.println();
      t--;
    }
  }
}

class Result {
  static Node reverseList(Node head) {
    if(head==null || head.next==null)
    {return head;}
    Node prev=null;
    Node next=null;
    Node curr=head;
    while(curr!=null)
    {
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    head=prev;
    return head;

  }
}
