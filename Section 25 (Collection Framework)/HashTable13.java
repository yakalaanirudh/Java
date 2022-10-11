import java.util.*;

public class HashTable13
{
    public static void main(String[] args) 
    {
        Hashtable<Integer,String> ht=new Hashtable<>();
        
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");
        
        
        Enumeration e=ht.elements();        //It is same as iterator
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        
        ht.compute(2,(k,v)->v+"Z");         //Add z to value of key 2

        ht.computeIfAbsent(7, (k)->"Z"+k);  //Since 7 is not there it will insert key 7 and value z7

        System.out.println(ht);
        
        
    }   
}

/*IT IS DEPRECATED
It is same as map, it stores key and value
 */
