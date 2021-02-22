class Node1{
    int data;
    Node1 left, right, parent;
    Node1(int d)
    {
        data=d;
        left=right=parent=null;
    }
}
class InorderSuccessor{
    static Node1 head;
    Node1 insert(Node1 node, int data)
    {
        if (node==null) {
            return (new Node1(data));
        }
        else {
            Node1 temp = null;
            if (data <= node.data) {
                temp = insert(node.left, data);
                node.left=temp;
                temp.parent=node;
            }
            else {
                temp = insert(node.right, data);
                node.right=temp;
                temp.parent=node;
            }
            return node;
        }
    }
 
    Node1 inOrderSuccessor(Node1 root, Node1 n)
    {
        if (n.right!=null) {
            return minValue(n.right);
        }
        Node1 p = n.parent;
        while (p != null && n == p.right) {
            n=p;
            p=p.parent;
        }
        return p;
    }
    Node1 minValue(Node1 node)
    {
        Node1 current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
    public static void main(String[] args) {
        InorderSuccessor tree = new InorderSuccessor();
        Node1 root = null, temp = null, suc = null, min = null;
        root=tree.insert(root, 20);
        root=tree.insert(root, 8);
        root=tree.insert(root, 22);
        root=tree.insert(root, 4);
        root=tree.insert(root, 12);
        root=tree.insert(root, 10);
        root=tree.insert(root, 14);
        temp=root.left.right.right;
        suc=tree.inOrderSuccessor(root, temp);
        if (suc!=null) {
            System.out.println( temp.data + " ---> " + suc.data);
        }
        else{
            System.out.println("NOT exist");
        }
    }
}