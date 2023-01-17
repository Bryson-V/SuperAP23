package Lab7;
import Lab7.pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;

class main {
    public static void main(String args[]) {
        stack test = new stack();
        test.push(10);
        test.push(11);
        test.push(12);
        test.push(13);
        test.print();
        System.out.println();
        System.out.println(test.peek());
        test.pop();
        System.out.println();

        System.out.println(test.peek());
        test.push(14);
        System.out.println();

        test.print();
    }
}