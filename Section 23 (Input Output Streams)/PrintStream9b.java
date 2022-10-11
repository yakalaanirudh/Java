import java.io.*;

class Student
{
    int rollno;
    String name;
    String dept;
}

public class PrintStream9b
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:\\MyJava\\Student1.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        
        
        Student s=new Student();
        s.rollno=Integer.parseInt(br.readLine());       //The read data type is string so we convert to integer
        s.name=br.readLine();
        s.dept=br.readLine();
        
        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.dept);
    }    
}

//This file is for reading