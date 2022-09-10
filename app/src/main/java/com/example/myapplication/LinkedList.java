package com.example.myapplication;

import java.util.ArrayList;

public class LinkedList {

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

    }

    private Node head, tail;

    public void addLast(int item){
        Node node = new Node(item);
        if(tail == null)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }

    }
    public void addFirst(int item){
        Node node = new Node(item);
        if(tail == null)
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }

    }
    public int valueOf(int index){
        Node temp = head;
        int count = 0;
        if(index<0) return -1;
        while (count < index && temp!= null) {
                temp = temp.next;
                count++;
        }
        if (temp == null)
            return -1;
        else return temp.value;

    }
    public boolean contains(int num){
        boolean v = false;
        Node tempNode = head;
        while (tempNode != null){
            if(tempNode.value==num)
                return true;
            tempNode = tempNode.next;
        }
       return v;

    }
    public void removeFirst(){
        Node t = head;
        head = head.next;
        t = null;

    }
    public void removeLast(){
        Node temp2 = head;
        while (tail != temp2.next)
            temp2 = temp2.next;
        tail = temp2;
        temp2.next = null;

    }

}
