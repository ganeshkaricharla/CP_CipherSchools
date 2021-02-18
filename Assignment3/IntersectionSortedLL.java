class IntersectionSortedLL
{
    static Node intersectionSortedLL(LinkedList list1,LinkedList list2)
    {
        Node dummy = new Node();
        Node res = dummy;

        while(true)
        {
            if(list1.head == null || list2.head == null)
            {
                break;
            }

            if(list1.head.data == list2.head.data)
            {
                //System.out.print(list1.head.data);
                res.next = list1.head;
                res = res.next;
                list1.head = list1.head.next;
                list2.head = list2.head.next;

            }
            else if(list1.head.data < list2.head.data)
            {
                list1.head = list1.head.next;
            }
            else
            {
                list2.head = list2.head.next;
            }
        
        }
        dummy = dummy.next;
        return dummy;
    }
    public static void main(String[] args)
    {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList res = new LinkedList();
        list1.insertEnd(1);
        list1.insertEnd(2);
        list1.insertEnd(3);
        list1.insertEnd(4);
        list1.insertEnd(5);
        list1.insertEnd(6);
        list2.insertEnd(2);
        list2.insertEnd(4);
        list2.insertEnd(6);
        list2.insertEnd(8);
        list1.show();
        list2.show();
        res.head = intersectionSortedLL(list1, list2);
        res.show();
        
    }
}