import java.util.*;
import java.io.*;

public class Properties14
{
    public static void main(String[] args) throws Exception
    {
        Properties p=new Properties();
        
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows10");
        p.setProperty("Model", "Latitude");
        
        
        p.storeToXML(new FileOutputStream("MyData.xml"), "Laptop"); //To write in file
        
        
        p.load(new FileInputStream("MyData.txt"));                          //To read from file
        
        System.out.println(p);
               
    }  
}


/*
Properties inherits from hashtable(collection of key value pairs)
In hashtable data can be of any type but here both should be string
 */