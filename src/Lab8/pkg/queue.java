package Lab8.pkg;
import java.util.Scanner;
import java.util.Random;


public class queue {
    /*  FIRST IN FIRST OUT  */
    Node head;
    Node tail;

    /*
        Postcondition: The top will be null.
    */
    public Queue() {
        head=null;
        tail=null;
    }

    /*
        Adds a node to the end of the queue
    */
    public void enqueue(int data){
        Node temp=new Node(data);
        if(head==null)
            head=temp;
        else if(tail==null){
            tail=temp;
            tail.setNext(head);
        }
        else{
            temp.setNext(tail);
            tail=temp;
        }
    }

    /*
        Removes a node from the front of the queue
    */
    public int dequeue(){
        Node temp=tail;
        Node tempret=null;
        Node ret=tail;
        while(temp.getNext()!=null) {
            temp = temp.getNext();
        }
        while(ret!=tail){
            tempret.setNext(ret.getData());
            ret=ret.getNext();
        }

    }

    /*
        Checks if the stack is empty.
    */
    public boolean isEmpty(){
    if(head==null)
        return true;
    return false;
    }

    /*
        Returns the value of the frontmost element
    */
    public int front(){

    }

    /*
        Returns the value at the end of the queue
    */
    public int back(){

    }

}