package com.trees.binary;

public class Main {

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        BinaryTree.preorderTraversal(root);
        System.out.println();
        BinaryTree.inorderTraversal(root);
        System.out.println();
        BinaryTree.postorderTraversal(root);
        System.out.println();
        BinaryTree.levelorderTraversal(root);
        System.out.println(BinaryTree.count(root));
        System.out.println(BinaryTree.height(root));
        System.out.println(BinaryTree.sum(root));
        System.out.println(BinaryTree.diameter(root));
        System.out.println(BinaryTree.diameter2(root).diameter);
    }
}
