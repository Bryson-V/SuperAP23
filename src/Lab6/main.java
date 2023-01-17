package Lab6;


import Lab6.pkg.SinglyLinkedList;

public class main {
    public static void main(String args[]){
        SinglyLinkedList n=new SinglyLinkedList();
        n.insert(0,0);
        n.insert(1,1);
        n.insert(2,2);
        n.insert(3,3);
        n.insert(4,4);
        n.insert(5,5);
        n.insert(6,6);
        n.insert(7,7);
        n.insert(8,8);
        n.insert(9,9);

        n.swap(1,2);
        n.printList();
            }
        }