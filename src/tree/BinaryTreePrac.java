package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePrac {
    static Node root;

    public void insert(Node root, int item) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node tempNode = q.peek();
            q.poll();
            if (tempNode.left != null) {
                q.add(tempNode.left);
            } else {
                tempNode.left = new Node(item);
                break;
            }

            if (tempNode.right != null) {
                q.add(tempNode.right);
            } else {
                tempNode.right = new Node(item);
                break;
            }
        }
    }

    public void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.item+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        BinaryTreePrac bt = new BinaryTreePrac();
        root = new Node(20);
        bt.insert(root,8);
        bt.insert(root,22);
        bt.insert(root,4);
        bt.insert(root,12);
        bt.insert(root,14);
        bt.preOrder(root);
    }
}
