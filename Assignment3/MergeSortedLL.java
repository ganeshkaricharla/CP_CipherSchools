class MergeSortedLL
{
    static Node mergeSortedLL(LinkedList list1,LinkedList list2)
    {
        Node res = new Node(); 
        Node ptr = res;
        while(true)
        {
            if(list1.head == null)
            {
                ptr.next = list2.head;
                break;
            }
            if(list2.head == null)
            {
                ptr.next = list1.head;
                break;
            }

            if(list1.head.data<=list2.head.data)
            {
                ptr.next = list1.head;
                list1.head = list1.head.next;
            }
            else
            {
                ptr.next = list2.head;
                list2.head = list2.head.next;
            }

            ptr=ptr.next;
        }
        return res;
    }

    public static void main(String[] args)
    {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.insertEnd(1);
        list1.insertEnd(3);
        list1.insertEnd(5);
        list1.insertEnd(7);
        list1.insertEnd(9);
        list2.insertEnd(2);
        list2.insertEnd(4);
        list2.insertEnd(6);
        list2.insertEnd(8);
        list1.show();
        list2.show();
        LinkedList res = new LinkedList();
        res.head = mergeSortedLL(list1,list2);
        res.show();
    }
}