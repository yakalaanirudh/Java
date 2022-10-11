import java.util.*;
import java.util.Map.*;

public class HashMap9
{ 
    public static void main(String[] args) 
    {    
        HashMap<Integer,String> tm=new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));


        System.out.println(tm);                     //{0=A,1=B,2=c,3=D}
        

        tm.put(4,"E");                  //To put values into the map
        tm.put(5,"F");
        


        System.out.println(tm.get(3));                         //C
                       
        
        
        
    }  
}

//A treeset stores values while treemap stores (key,value) pairs
//A tree maintains data in sorted order
//In hash elements will not be sorted
//Hashmap has constant time for basic operations while tree map has logn time for basic operations