import java.util.*;

public class LinkedHashSet12 
{
    public static void main(String[] args) 
    {
        LinkedHashSet<String> lhs=new LinkedHashSet<>(10);
        
        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");
        lhs.add("B");
        
        Iterator<String> itr=lhs.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }   
}

/*
It maintains order of insertion of elements
LHM stores keys and values LHS stores only values
Wont allow duplicates
 */