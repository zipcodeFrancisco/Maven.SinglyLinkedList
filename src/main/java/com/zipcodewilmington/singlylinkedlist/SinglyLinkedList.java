package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */

/**
 * You may not use the LinkedList or ArrayList class or any other predefined Java collections
 * Your linked list must have a node inner class to represent each element
 * Your linked list must have add, remove, contains, find, size, get, copy and sort methods
 */

public class SinglyLinkedList<E> {

    Node head;

    class Node{

        Node next;
        E data;
        public Node(E data) {
            this.data = data;
        }

    }
    public void add(E data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void remove(int index){
        if (head == null) return;
        if (index == 0){
            head = head.next;
            return;
        }

        Node current = head;
        int counter = 0;
        while (current != null){
            if(counter == index - 1){
                current.next = current.next.next;
                return;
            }
            current = current.next;
            counter++;
        }
    }
    public boolean contains(E value){

        Node current = head;
        while (current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public int find(E data) {
        Node current = head;
        int counter = 0;
        while ( current != null ) {
            if (current.data == data) {
                return counter;
            }
            current = current.next;
            counter++;
        }
        return -1;
    }

    public int size() {
        Node current = head;
        int counter = 0;
        while (current != null){
            current = current.next;
            counter++;
        }
        return counter;
    }


    public E get(int index) {
        Node current = head;
        int counter = 0;
        while (current != null){
            if (counter == index){
                return current.data;
            }
            current = current.next;
            counter++;
        }
        throw new NullPointerException();
    }

    public SinglyLinkedList<E> copy() {
        SinglyLinkedList<E> newSLL = new SinglyLinkedList<E>();
        Node current = head;

        while (current != null){
            newSLL.add(current.data);
            current = current.next;
        }
        return newSLL;
    }

    // TODO In process...
    public void sort() {
        Node current = head;

        while (current != null){

            current = current.next;
        }
    }




}
