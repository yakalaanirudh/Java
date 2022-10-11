import java.io.*;

public class ByteStreams4 
{
    public static void main(String[] args) throws Exception
    {
        
        char c[]={'a','b','c','d','e','f','g','h','i','j'};
        
        CharArrayReader cr=new CharArrayReader(c);
        
        int x;
        
        while((x=cr.read())!=-1)
        {
            System.out.print((char)x);
            
        }
        
        cr.close();
        
    }
}

/*

public class ByteStreams4 
{
    public static void main(String[] args) throws Exception
    {
        
        byte b[]={'a','b','c','d','e','f','g','h','i','j'};
        
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        
        int x;
        
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);          //WE are typecasting as character
            
        }
        
        cr.close();
        
    }
}
abcdefghij
 */


 /*

public class ByteStreams4 
{
    public static void main(String[] args) throws Exception
    {
        
        byte b[]={'a','b','c','d','e','f','g','h','i','j'};
        
        ByteArrayInputStream bis=new ByteArrayInputStream(b);

        String str=new String(bis.readAllbytes())
        
        System.out.println(str)
        System.out.println(bis.markSupported())
        cr.close();
        
    }
}
abcdefghij
true
 */



