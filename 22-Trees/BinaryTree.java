import java.util.LinkedList;
import java.util.Queue;
public class BinaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTrees {
        static int i = -1;
        public static Node BuildTree(int nodes[]) {
            i++;
            if(nodes[i] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[i]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelorder(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root == null) {
            System.out.println("This tree is empty");
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                } 
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    public static int hight(Node root) {
        if(root == null) {
            return 0;
        }
        int left = hight(root.left);
        int right = hight(root.right);
        int h = Math.max(left, right) + 1;
        return h;
    }

    public static int diameterMethod1(Node root) {
        if(root == null) {
            return 0;
        }
        int d1 = diameterMethod1(root.left);
        int d2 = diameterMethod1(root.right);
        int d3 = hight(root.left) + hight(root.right) + 1;

        return Math.max(d3, Math.max(d1, d2));
    }

    static class Treeinfo {
        int ht;
        int diam;

        Treeinfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }

    }
    public static Treeinfo diameterMethod2(Node root) {
        if(root == null) {
            return new Treeinfo(0, 0);
        }
        Treeinfo left = diameterMethod2(root.left);
        Treeinfo right = diameterMethod2(root.right);
        int myhight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(Math.max(diam1, diam2), diam3);
        Treeinfo myinfo = new Treeinfo(myhight, mydiam);
        return myinfo;
    }

    public static boolean isSubtree(Node root, )
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTrees tree = new BinaryTrees();
        Node root = tree.BuildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        System.out.print("There are "+ countNodes(root)+ " Nodes in this tree\n");
        System.out.print("Sum of all Nodes is: "+ sumOfNodes(root) + "\n");
        System.out.print("Hight of tree is: "+ hight(root) + "\n");
        System.out.print("DiameterMethod1 of tree is: "+ diameterMethod1(root) + "\n");
        System.out.print("DiameterMethod2 of tree is: "+ diameterMethod2(root).diam + "\n");
    }
}
