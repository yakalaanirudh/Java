import java.io.*;

public class RandomAccessFile7
{
    public static void main(String[] args) throws Exception
    {
        RandomAccessFile rf=new RandomAccessFile("C:\\MyJava\\Data.txt","rw");
       //byte b[]={'A','B','C','D','E','F','G''H','I','J'};
       
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('d');
        System.out.println((char)rf.read());
        rf.skipBytes(3);
        System.out.println((char)rf.read());
        rf.seek(3);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer()+2);
        System.out.println((char)rf.read());
       
    }   
}

//In sequential access if we open a file and write it will overwrite from the first point
//In random access if we read till 5th byte and then start to write it will write at 6th byte so no over wrting
//In random access file we can point to a specific byte to be read