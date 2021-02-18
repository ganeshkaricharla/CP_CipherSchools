class DeleteNodeLL
{
    static void deleteNodeLL(LinkedList list,int num)
    {
        Node curr = list.head;
        Node prev = list.head;
        while(curr.data != num && curr.next != null)
        {
            prev = curr;
            curr = curr.next;
        }
        if(curr.data != num)
        {
            System.out.println("Not Found");
        }
        else
        {
            prev.next = curr.next;
            curr.next = null;
        }

    }
    public static void main(String[] args)
    {
        int num = 4;
        LinkedList list = new LinkedList();
        list.insertEnd(1);
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(4);
        list.insertEnd(4);
        list.insertEnd(5);
        list.show();
        deleteNodeLL(list,num);
        list.show();
    }
}