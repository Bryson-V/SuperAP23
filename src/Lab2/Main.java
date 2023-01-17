package Lab2;
import Lab2.pkg.*;

import java.util.*;
import java.time.*;
import java.lang.*;


class Main {
    static final long createdNano = System.nanoTime();

    public static void main(String args[]) {
        long start = System.nanoTime();
        long finish = System.nanoTime();
        System.out.println("Created: " + createdNano);

        int [] times = {10, 100, 1000, 10000, 100000, 1000000, 10000000};
        int [] nums = new int[100];


        System.out.println("-------------------Test-------------------");
        System.out.println("");
        for(int i : times){
            System.out.println("Interval: " + i);

            nums = new int[i];
            start = System.nanoTime();

            //  Put your method between these two comments
            BaseClass run=new BaseClass(nums);
            run.Randomize();
            run.merge(nums, 0, nums.length-1);
            //

            finish = System.nanoTime();
            System.out.println("Started: " + start);
            System.out.println("Finished: " + finish);
            System.out.println("Duration: " + (finish-start));
            System.out.println("");
        }
    }
}
