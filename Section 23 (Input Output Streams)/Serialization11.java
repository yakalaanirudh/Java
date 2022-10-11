import java.io.*;

class Student implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;    
    public static int Data=10;  //STATIC MEMEMBERS ARE NOT SERIAZALBLE 
    public transient int t;     //IF WE DONT WANT ANY MEMEBERS TO BE SERIALAZABLE MAKE IT TRANSIENT
    
    public Student()        //iT MUST HAVE  A NON PARAMETRIZED CONSTRUCTOR
    {
        
    }
    public Student(int r,String n,float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;               //Even though we set to a  different value it will still be 10
        t=500;                  //Even though we set to a  different value it will still be 0
    }
    
    public String toString()        //We are writing this method just to output everything
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
    
}

public class Serialization11
{
   /* public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("C:\\MyJava\\Student3.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Student s=new Student(10,"John",89.9f,"CSE");
        
        oos.writeObject(s);
        
        fos.close();
        oos.close();
        
    }
    */
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:\\MyJava\\Student3.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Student s=(Student)ois.readObject();
        
        System.out.println(s);
        
        fis.close();
        ois.close();
        
    }
}
/*OUTPUT
        rollno=10;
        name=John;
        avg=89.9;
        dept=CSE;
        Data=10;               //Even though we set to a  different value it will still be 10
        t=0;
 */
