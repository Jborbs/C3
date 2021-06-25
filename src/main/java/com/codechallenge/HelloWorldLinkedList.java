package com.codechallenge;

public class HelloWorldLinkedList {
    Node head;

    public HelloWorldLinkedList(){
    }

    public HelloWorldLinkedList(Node head){
        this.head = head;
    }

    public void add(Character value){
        Node node = new Node(value, null);

        if(head == null){
            head = node;
        }
        else{
            Node current = head;
            while(current.next != null){
                current= current.next;
            }
            current.next = node;
        }

    }

    public boolean isEmpty(){
        return head == null;
    }

    public Character pop(){
        if(isEmpty()){return null;}
        Character result = head.data;
        Node temp;
        temp = head.next;
        head =temp;
        return result;
    }

    static class Node{
        char data;
        Node next;

        public Node(){
        }
        public Node(Character data, Node next){
            this.data = data;
            this.next = next;
        }
    }

}
