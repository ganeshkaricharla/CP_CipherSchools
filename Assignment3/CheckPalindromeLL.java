class CheckPalindromeLL

{
    static boolean isPalindrome(LinkedList list)
    
    {
        Node midnode=null;
        Node slowptr=list.head;
        Node slowptrprev=list.head;
        Node fastptr=list.head;
        boolean res=true;
        if(list.head!=null && list.head.next!=null)
        
        {
            while(fastptr!=null && fastptr.next!=null)
            
            {
                fastptr=fastptr.next.next;
                slowptrprev=slowptr;
                slowptr=slowptr.next;
            }
            if(fastptr!=null)
            {
                midnode=slowptr;
                slowptr=slowptr.next;
            }
            Node secondhalf=slowptr;
            slowptrprev.next=null;
            secondhalf=reverseLinkedList(secondhalf);
            res=checkLL(list.head,secondhalf);
        }
        return res;
    }
    static boolean checkLL(Node head1,Node head2)
    {
        Node node1=head1;
        Node node2=head2;
        while(node1!=null && node2!=null)
        {
            if(node1.data==node2.data)
            {
                node1=node1.next;
                node2=node2.next;
            }
            else
            {
                return false;   
            }
        }
        if(node1==null && node2==null)
            return true;
        else
            return false;
    }
    static Node reverseLinkedList(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr != null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    public static void main(String[] args) 
    {
        LinkedList list1=new LinkedList();
        list1.insertEnd(1);
        list1.insertEnd(2);
        list1.insertEnd(3);
        list1.insertEnd(2);
        list1.insertEnd(1);
        boolean res=isPalindrome(list1);
        if(res==false)
            System.out.print("Not Palindrome");
        else
            System.out.print("Is Palindrome");
    }
}