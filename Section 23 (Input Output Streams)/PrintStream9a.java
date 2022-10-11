import java.io.*;

class Student
{
    int rollno;
    String name;
    String dept;
}

public class PrintStream9a
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("C:\\MyJava\\Student1.txt");
        PrintStream ps=new PrintStream(fos);
        
        
        Student s=new Student();
        s.rollno=10;
        s.name="John";
        s.dept="CSE";
        
        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);
        
        ps.close();
        fos.close();
        
    }    
}

//This file is for writing
/*
Printstream is atteched to outputstream
Whatever we write in print stream will go to output stream which in turn will go to object of class Student
 */