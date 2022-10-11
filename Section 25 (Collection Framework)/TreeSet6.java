import java.util.*;

public class TreeSet6 {

    public static void main(String[] args) {

        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
        System.out.println(ts);         //10 30 40 50 70        //It is a sorted set
        //the above will call toString() Method


        ts.add(25);
        System.out.println(ts);         //10 2530 40 50 70


        //ts.ceiling(55);       //Gives a number greater than or equal to 55    //70
        System.out.println(ts);

    }

}

//A treeset doesnot allow duplicates and follows tree type data structure
//It is a sorted set
//It is a set so no duplicates
//It guarantees log(n) time for add removal

//SortedSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
// We can only call methods of SortedSet on ts

//Collection<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
// We can only call methods of Collection Interface on ts