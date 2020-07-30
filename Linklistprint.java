class Linklistprint
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
    public static void main(String args[])
    {
        Linklist s1=new Linklist();
        s1.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode fourth=new ListNode(11);
        
        s1.head.next=second;
        second.next=third;
        third.next=fourth;
        
        
        s1.display();
        
        
    }
    
    
    
    
    
}
