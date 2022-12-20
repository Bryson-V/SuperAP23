package Lab1.pkg;

import java.util.*;
import java.io.*;

public class Message {

    // Default Constructor
    String person;
    String subject;
    String body;
    int number;
    ArrayList<Message> childlist=new ArrayList<Message>();
    public Message() {

    }

    // Parameterized Constructor
    public Message(String auth, String subj, String bod, int i) {
    person=new String(auth);
    subject=new String(subj);
    body=new String(bod);
    number=i;
    }

    // This function is responsbile for printing the Message
    // (whether Topic or Reply), and all of the Message's "subtree" recursively:

    // After printing the Message with indentation n and appropriate format (see output details),
    // it will invoke itself recursively on all of the Replies inside its childList,
    // incrementing the indentation value at each new level.

    // Note: Each indentation increment represents 2 spaces. e.g. if indentation ==  1, the reply should be indented 2 spaces,
    // if it's 2, indent by 4 spaces, etc.
    public void print(int indentation) {
        System.out.println(person+" "+subject+" "+body+" "+number);
        for (int i = 0; i < indentation+1; i++)
            System.out.print("  ");
        for (int i = 0; i < childlist.size(); i++)
            childlist.get(i).print(indentation + 1);
    }
    // Default function for inheritance
    public boolean isReply(){
    return true;
    }

    // Returns the subject String
    public String getSubject(){
    return subject;
    }

    // Returns the ID
    public int getId(){
    return number;
    }

    // Adds a child pointer to the parent's childList.
    public void addChild(Message child){
    childlist.add(child);
    }

}
