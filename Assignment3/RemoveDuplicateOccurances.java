class RemoveDuplicateOccurances{
    static void removeDuplicates(LinkedList list){//in sorted LL
        Node curr=list.head;
        while(curr!=null){
            Node tmp=curr;
            while(tmp!=null && tmp.data==curr.data)
                tmp=tmp.next;
            curr.next=tmp;
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertEnd(1);
        list.insertEnd(1);
        list.insertEnd(1);
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(3);
        list.insertEnd(4);
        list.insertEnd(5);
        list.insertEnd(6);
        list.insertEnd(6);
        removeDuplicates(list);
        list.show();
    }
}--------