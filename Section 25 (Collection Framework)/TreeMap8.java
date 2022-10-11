import java.util.*;
import java.util.Map.*;

public class TreeMap8
{ 
    public static void main(String[] args) 
    {    
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));


        System.out.println(tm);                     //{0=A,1=B,2=c,3=D}
        

        tm.put(4,"E");                  //To put values into the map
        tm.put(5,"F");
        

        System.out.println(tm.ceilingEntry(5).getValue());     //F

        System.out.println(tm.get(3));                         //C
        
        Entry<Integer,String> e=tm.firstEntry();                    
        System.out.println(e.getKey()+" "+e.getValue());            //0,A
        
        
        
    }  
}

//A treeset stores values while treemap stores (key,value) pairs
//A tree maintains data in sorted order