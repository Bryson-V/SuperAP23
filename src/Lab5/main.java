package Lab5;

import Lab5.pkg.Node;

import java.util.ArrayList;

public class main {
    public static void main(String args[]){
    ArrayList<Node> x=new ArrayList<Node>();
    for (int i=0; i<100;i++)
    {
        Node y=new Node((int)(Math.random()*10000));
        x.add(y);
    }
    for(int i=0;i<100;i++)
    System.out.println(x.get(i).getData());
}
}