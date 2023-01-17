package Lab6.pkg;

import java.util.Scanner;
import java.util.Random;


public class SinglyLinkedList {
    Node head;

    /*
        Postcondition: The head will be null
    */
    public SinglyLinkedList() {
    head=null;
    }

    /*
        Receives an integer position, searches through the SinglyLinkedList for the position and returns the data at that positon
           If the position doesn't exist, it returns -1
    */
    public int get(int pos){
        Node last=head;
    for(int i=0;i<pos;i++)
        last=last.getNext();
    return last.getData();

    }

    /*
        Insert a new Node at the given position with the data given
    */
    public void insert(int pos , int data){
       Node temp =  new Node(data);
       Node last=head;
       Node add=null;
       if(last != null)
            add = last.getNext();

        if(head == null)
       {
           head = temp;
       }
        else if(pos==0) {
            head = new Node(data);
            head.setNext(last);
        }
       else{
           int c = 0;
           while(c<pos-1)
           {
               try {
                   if(last.getNext() != null ) {
                       last = last.getNext();
                       add = last.getNext();
                       last.getNext().getNext();
                   }
               }
               catch (Exception e)
               {
               break;
               }
               c++;
           }
           last.setNext(temp);
           if(pos<length(head))
               temp.setNext(add);


       }
    }

    /*
        Remove the node at the given position
        If no position exists, don't change the list
    */
    public void remove(int pos){
        Node temp=head;
    if(pos<=length(head))
        for(int i=0;i<length(head);i++) {
            if(i!=pos-1)
                temp=temp.getNext();
            else
                temp.setNext(temp.getNext().getNext());
        }
    else
        System.out.println("No Change");
    }

    /*
        Swap two Nodes with the two positions given
    */
    public void swap(int pos1, int pos2){
    Node first = null;
    Node second = null;
    Node temp=head;
    if(pos1!=0 || pos2!=0)
        for(int i=0;i<length(head)-5;i++)
        {
        if(i !=pos1-1 || i !=pos2-2) {
            temp = temp.getNext();
        }
        if(i==pos1-1){
            first=temp.getNext();
            temp=temp.getNext();
        }
        if(i==pos2-2){
            second=temp.getNext();
            temp=temp.getNext();
        }
    }
    remove(pos1);
    remove(pos2-1);
    insert(pos1, second.getData());
    insert(pos2, first.getData());
//
//
//    Node prev1=head
//    Node curr1=head;
//    int c=1;
//    boolean flag=false
//    if(pos1==0)
//        curr1=head;
//    while (curr1!= null){
//            if(c==pos1)
//                break;
//            curr1=curr1.getNext();
//            c++
//        }
//    Node prev2=head
//    Node curr2=head;
//    int c=1;
//    while (curr2!= null){
//        if(c==pos2)
//            break;
//        curr2=curr2.getNext();
//        c++;
//        }

    }

    /*
        Print all data values in the LinkedList
    */
    public void printList(){
        Node temp=head;
        while(temp != null) {
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
        }
    private int length(Node insert) {

        if (insert == null) {
            return 0;
        }
        return 1 + length (insert.getNext());

    }
    }
