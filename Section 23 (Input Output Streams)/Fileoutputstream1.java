import java.io.*;

public class Fileoutputstream1 {

    public static void main(String[] args) throws Exception
    {
        
        try(FileOutputStream fos=new FileOutputStream("C:/MyJava/Test.txt");)
        {
        
        String str="earn Java Programming.";
        
        byte b[]=str.getBytes();                //Convert into array of bytes the string
        
        /*
        //fos.write(str.getBytes());    //This is for writing bytes one by one
        for(byte x:b)
            fos.write(x);*/
        //fos.write(b, 6, str.length()-6);
        
        fos.write(b);
        
        //fos.close();
        
        }
        /*catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }*/
    }
    
}

//try(FileOutputStream fos=new FileOutputStream("C:/MyJava/Test.txt");)
//In the above we are creating a output stream object and wea re outputting to a file named C:/MyJava/Test.txt
