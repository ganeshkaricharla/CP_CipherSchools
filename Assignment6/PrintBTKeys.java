class PrintKeys{
    static Node root;
    void Print(Node node, int k1, int k2) {
        if (node == null) {
            return;
        }
        if (k1 < node.key) {
            Print(node.left, k1, k2);
        }
        if (k1 <= node.key && k2 >= node.key) {
            System.out.print(node.key + " ");
        }
        if (k2 > node.key) {
            Print(node.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        PrintKeys tree = new PrintKeys();
        int n1 = 10, n2 = 25;
        tree.root = new Node(18);
        tree.root.left = new Node(6);
        tree.root.right = new Node(24);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(12);
        tree.Print(root, n1, n2);
    }
}