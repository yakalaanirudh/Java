import java.io.*;

public class BufferedStream5
{
    public static void main(String[] args)throws Exception 
    {
        FileReader fis=new FileReader("Test.txt");
        BufferedReader bis=new BufferedReader(fis);
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        System.out.println("String "+bis.readLine());
        
        bis.close();
    }    
}

//File Input Stream attached to a file but a buffered inout stream attaches to a stream
//System.out.print(fis.markSupported());        false
//System.out.print(bis.markSupported());        true
//bis supports marks while fis does not
//"Learn Java Programming"      We placed a mark on first r
//Learn Jrn Java Programming

