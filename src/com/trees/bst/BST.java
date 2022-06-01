package com.trees.bst;

public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
        } else if(root.data>val) {
            root.left = insert(root.left,val);
        } else {
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inorderTraversal(Node root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data);
        inorderTraversal(root.right);
    }

    public static void search(Node root,int val){
        if(root == null){
            System.out.println(val +" not found in the bst");
            return;
        } else if(root.data == val){
            System.out.println(val +" found in the bst");
        } else if(root.data > val){
            search(root.left,val);
        } else {
            search(root.right,val);
        }
    }

    public static Node delete(Node root,int val){
        if(root.data>val){
            return delete(root.left, val);
        }else if(root.data<val){
            return delete(root.right,val);
        }else {
            // when root.data equals val
            //case 1 no child
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2 one child
            else if(root.left==null || root.right==null){
                return root.left==null ? root.right:root.left;
            }
            //case 3 two child
            else {
                Node is = inorderSuccessor(root.right);
                root.data = is.data;
                root.right = delete(root.right,is.data);
            }
        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }



    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        inorderTraversal(root);
        System.out.println();
        search(root,9);
        delete(root,3);
        System.out.println();
        inorderTraversal(root);
    }
}
