package com.linkedlist;

public class LL {
    Node head;
    int size=0;

    public class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        size++;
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addLast(String data){
        size++;
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }else {
            Node cur = head;
            while(cur.next !=null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public void printList(){
        if(head == null){
            System.out.println("Linked List is empty");
        }else {
            Node curr = head;
            while(curr!=null){
                System.out.print(curr.data+"->");
                curr = curr.next;
            }
            System.out.println("NULL");
        }
    }

    public void deleteFirst(){
        if(head == null) {
            System.out.println("Linked List is empty");
        }else {
            size--;
            head = head.next;
        }
    }

    public void deleteLast(){
        if(head == null) {
            System.out.println("Linked List is empty");
        }else if(head.next == null){
            size--;
            head = null;
        }else {
            Node curr = head;
            size--;
            while(curr.next.next != null){
                curr = curr.next;
            }
            curr.next = null;
        }
    }

    public void reverseIterative() {
        if(head == null && head.next == null){
            return;
        }
        Node curr = head.next;
        Node prev = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }

    public void reverseRecursiveHelper(Node head){
        if(head.next == null ){
            this.head = head;
            return;
        }
        reverseRecursiveHelper(head.next);
        head.next.next = head;
    }

    public void reverseRecursive() {
        Node origin = head;
        reverseRecursiveHelper(head);
        origin.next = null;
    }

    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.addFirst("is");
        linkedList.addFirst("This");
        linkedList.addLast("Linked List");
        linkedList.printList();
        System.out.println("size: "+linkedList.size);
        linkedList.reverseIterative();
        linkedList.printList();
        linkedList.reverseRecursive();
        linkedList.printList();
    }
}
