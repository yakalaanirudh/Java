import java.util.*;

public class LinkedHashMap11 
{
    public static void main(String[] args) 
    {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5){
            
            protected boolean removeEldestEntry(Map.Entry e)        //This is to limit size to 5,it must be PROTECTED
            {
                return size()>5;
            }
        };
        
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        String s=lhm.get(2);
        s=lhm.get(5);
        s=lhm.get(1);
        lhm.put(6,"F");
        
        lhm.forEach((k,v)->System.out.println(k+" "+v));    //A B C D E F order maintained    5 is initial size it is increased
        
    }   
}

/*
LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,0.75f,true)
0.75    loading factor
true    shown in order of access

 */