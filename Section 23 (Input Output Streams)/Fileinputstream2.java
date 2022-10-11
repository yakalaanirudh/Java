import java.io.*;

public class Fileinputstream2 {

    public static void main(String[] args) throws Exception
    {
        
        try(FileInputStream fis=new FileInputStream("C:/MyJava/Test.txt");)
        {
            byte b[]=new byte[fis.available()];         //How many bytes are availble that is the length of the array
            fis.read(b);
            String str=new String(b);
            System.out.println(str);
        }
    }
}

/*USING A WHILE LOOP
try(FileInputStream fis=new FileInputStream("C:/MyJava/Test.txt");)
{
    int x;
    while((x=fis.read())!=1)
    {
        System.out.println((char)x)
    }
}
*/