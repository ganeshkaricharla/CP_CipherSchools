class ReverseLL
{
    static void reverseLL(LinkedList list)
    {
        Node next = null;
        Node curr = list.head;
        Node prev = null;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list.head = prev;

    }
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insertEnd(1);
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(5);
        list.insertEnd(6);
        list.show();
        reverseLL(list);
        list.show();
    }
}