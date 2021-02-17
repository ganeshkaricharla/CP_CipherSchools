public class LinkedList
{
    Node head;

    public void insertEnd(int num)
    {
        Node node = new Node();
        node.data = num;
        if (head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node node = head;
        while(node.next !=null)
        {
            System.out.print(node.data);
            System.out.print(" ");
            node = node.next;
        }
        System.out.print(node.data);
        System.out.println();}

    public int size()
    {
        int count = 0;
        Node node = head;
        while(node.next !=null)
        {   count +=1;
            node = node.next;
        }
        return count + 1;
    }

    public void insertBeg(int num)
    {
        Node n = new Node();
        n.data = num;
        if(head == null)
        {
            head = n;
        }
        else
        {
            n.next = head;
            head = n;
        }

    }
    
    }
