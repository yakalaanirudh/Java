import java.util.*;
import java.io.*;

public class StringTokenizer15 {

    public static void main(String[] args) throws Exception
    {
        // File path must be valid
        FileInputStream fis=new FileInputStream("/Users/abdulbari/Documents/Data.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        
        String data=new String(b);

        //String data="name=Vijay address=delhi country=india dept=cse";
    
        
        StringTokenizer stk=new StringTokenizer(data,",");
        
        String s;
        ArrayList<Integer> al=new ArrayList<>();
        
        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            al.add(Integer.valueOf(s));         //Adding the numbers from the file to arraylist
            
        }
        
        System.out.println(al);

    }
    
}


/*
It is used to break a string based on a character like ; , /
 */