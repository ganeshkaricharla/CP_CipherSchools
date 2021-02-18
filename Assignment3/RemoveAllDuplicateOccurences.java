class RemoveAllDuplicateOccurences
{
    static void removeAllDuplicate(LinkedList list)
    {
        Node dummy = new Node();
        dummy.next = list.head;
        
        Node prev = dummy;
        Node curr = list.head;

        while(curr != null)
        {
            while(curr.next != null && curr.next.data == prev.next.data)
            {
                curr = curr.next;
            }

            if(prev.next == curr)
            {
                prev = prev.next;
            }
            else
            {
                prev.next = curr.next;
            }

            curr = curr.next;
        }
        list.head = dummy.next;
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insertEnd(1);
        list.insertEnd(1);
        list.insertEnd(1);
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(3);
        list.insertEnd(4);
        list.show();
        removeAllDuplicate(list);
        list.show();

    }
}