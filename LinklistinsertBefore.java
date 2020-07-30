class Linklist
{
    ListNode head;
    static class ListNode
    {
        int data;
        ListNode next;
        
        ListNode(int data)
        {
            this.data=data;
            next=null;
        }
    }
    public void display()
    {
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data +"---->");
            current=current.next;
        }
        System.out.println("null");
    }
    
    
    
    public int length()
    {
        if(head==null)
            return 0;
        int count=0;
        ListNode current=head;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }
    public void insert(int value)
    {
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public static void main(String args[])
    {
        Linklist s1=new Linklist();
        
        s1.insert(1);
        s1.insert(8);
        s1.insert(5);
        s1.insert(2);
        s1.display();
        System.out.println("length is--->"+s1.length());
        
        
    }
    
    
    
    
    
}
