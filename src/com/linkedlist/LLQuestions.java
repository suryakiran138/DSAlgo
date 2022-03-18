package com.linkedlist;


public class LLQuestions {

    // find and delete nth Node from end of the Linked List
    public static void delete(LL list, int n){
        int index = list.size - n + 1;
        LL.Node curr = list.head;
        for(int i=0;i<index-2;i++){
            curr = curr.next;
        }
        System.out.println("data: "+curr.data+" next: "+curr.next.data);
        curr.next = curr.next.next;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.printList();
        delete(list, 2);
        list.printList();
    }
}
