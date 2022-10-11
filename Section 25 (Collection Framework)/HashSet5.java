import java.util.*;

public class HashSet5 {

    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>(20,0.75f);

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);

        System.out.println(hs);
    }

}
//A Hashset means means it uses hasing and it is a set so it doesnot allow duplicates
//10 20 30      10 is not duplicated as set does not allow duplicates
//They may not be in the order we inserted
//Hash set does not allow duplicates
//HashSet takes constant time for add and remove operations whereas arraylist and linkedlist takes linear time
//In a hash set we can mention the initial capacity
//We can also specify loading factor
//But since hashset has  a loading factor we have unused space so be careful if we choose to use it
//It is because of this loading factor(empty space) addition and removal of elements is constant time