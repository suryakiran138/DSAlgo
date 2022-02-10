package com.trees.binary;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    static int counter = -1;

    public static Node buildTree(int[] nodes) {
        counter++;
        if(nodes[counter] == -1)
            return null;
        Node newNode = new Node(nodes[counter]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public static void preorderTraversal(Node node){
        if(node == null)
            return;
        System.out.print(node.data);
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public static void inorderTraversal(Node node){
        if(node == null)
            return;
        inorderTraversal(node.left);
        System.out.print(node.data);
        inorderTraversal(node.right);
    }

    public static void postorderTraversal(Node node){
        if(node == null)
            return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data);
    }

    public static void levelorderTraversal(Node node){
        if(node==null) return;
        Queue<Node> queue =  new LinkedList<>();
        queue.add(node);
        queue.add(null);

        while(!queue.isEmpty()){
            Node currNode = queue.remove();
            if(currNode==null){
                System.out.println();
                if(queue.isEmpty())
                    break;
                else
                    queue.add(null);
            } else {
                System.out.print(currNode.data);
                if(currNode.left!=null)
                    queue.add(currNode.left);
                if(currNode.right!=null)
                    queue.add(currNode.right);

            }
        }
    }

    public static int count(Node node) {
        if(node ==  null) return 0;
        else return 1+count(node.left)+count(node.right);
    }

    public static int height(Node node) {
        if(node==null) return 0;
        else return 1 + Math.max(height(node.left),height(node.right));
    }

    public static int sum(Node node) {
        if(node==null) return 0;
        else return node.data + sum(node.left) + sum(node.right);
    }
    /**
     * diameter of a tree is number of nodes present in longest
     * path between any teo nodes
     * */
    public static int diameter(Node node) {
        if(node==null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(Math.max(diameter(node.left),diameter(node.right)),1+leftHeight+rightHeight);
    }

    static class TreeInfo {
        int height;
        int diameter;

        public TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    /**
     * diameter2 function returns diameter of binary tree with
     * linear time complexity
     * */
    public static TreeInfo diameter2(Node node){
        if(node ==  null) return new TreeInfo(0,0);
        TreeInfo leftTreeInfo = diameter2(node.left);
        TreeInfo rightTreeInfo = diameter2(node.right);
        int height = 1+Math.max(leftTreeInfo.height,rightTreeInfo.height);
        int diameter = Math.max(1+rightTreeInfo.height+leftTreeInfo.height,Math.max(leftTreeInfo.diameter,rightTreeInfo.diameter));
        return new TreeInfo(height,diameter);
    }
}
