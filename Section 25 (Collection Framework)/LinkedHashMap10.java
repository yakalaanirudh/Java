import java.util.*;

public class LinkedHashMap10
{
    public static void main(String[] args) 
    {
        HashMap<Integer,String> hm=new HashMap<>();
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();

        hm.put(5,"E");
        hm.put(1,"A");
        hm.put(4, "D");
        hm.put(2, "B");
        hm.put(3,"C");
        hm.put(6,"A");
        
        lhm.put(5,"E");
        lhm.put(1,"A");
        lhm.put(4,"D");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(6,"A");
        
        System.out.println(hm);
        String s=lhm.get(5);
        lhm.put(4,"K");
        lhm.get(1);
        System.out.println(lhm);
    }    
}

/*
HashMap is used for storing key and values
LinkedHashMap is used for storing key and values

A hashmap contains only values but in linked hashmaps they also have pointers like doubly linked lists
Default loading factor for hash map is 75%

LinkedHashmap will maintain order of entry hashmap wont

If we limit size of LHM lets say 10 if we insert 11th key then it will remove 1 entry

Remove add all take sconstant time in both hashmap and linkedhashmap

In linkedlist iterating takes time because it has to go through all entries of the link

ORDER OF ACCESS MEANS mostly visisted dispalayed first
 */