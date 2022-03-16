package com.linkedlist;

public class LL {
    Node head;

    public class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
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
            head = head.next;
        }
    }

    public void deleteLast(){
        if(head == null) {
            System.out.println("Linked List is empty");
        }else if(head.next == null){
            head = null;
        }else {
            Node curr = head;
            while(curr.next.next != null){
                curr = curr.next;
            }
            curr.next = null;
        }
    }

    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.addFirst("is");
        linkedList.addFirst("This");
        linkedList.addLast("Linked List");
        linkedList.printList();
        linkedList.deleteFirst();
        linkedList.deleteLast();
        linkedList.printList();
    }
}
