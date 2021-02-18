class OddEvenArrangement
{
    static void oddEvenArrangement(LinkedList list1)
    {
    if (list1.head == null)  
        return; 
    Node odd = list1.head;  
    Node even = list1.head.next;  
    Node evenFirst = even;

    while (true)  
    { 
        if (odd == null || even == null || (even.next) == null)  
        {  
            odd.next = evenFirst;  
            break;  
        }  
        odd.next = even.next;  
        odd = even.next;  
        if (odd.next == null)  
        {  
            even.next = null;  
            odd.next = evenFirst;  
            break;  
        }  
        even.next = odd.next;  
        even = odd.next;  
    }   
    }

    public static void main(String[] args)
    {
        LinkedList list1 = new LinkedList();
        list1.insertEnd(1);
        list1.insertEnd(2);
        list1.insertEnd(3);
        list1.insertEnd(4);
        list1.insertEnd(5);
        list1.insertEnd(6);
        list1.show();
        oddEvenArrangement(list1);
        list1.show();
    }
}