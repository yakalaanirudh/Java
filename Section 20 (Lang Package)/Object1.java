/*Object class is the parent class of all classes in java*/
import java.lang.*;


class MyObject
{
    public String toString()
    {
        return "My Object";
    }

    public int hashCode()       /*This makes all the objects have hashcode 100*/
    {
        return 100;
    }
    public boolean equals(Object o)     /*We are overrding equals method to compare hashcodes*/
    {
        return this.hashCode()==o.hashCode();
    }
    /*public void notify()            /*We cannot override notify or wait as they are FINAL methods*/
    {

    }
}

public class Object1
{
    public static void main(String[] args)
    {
        MyObject o1=new MyObject();
        MyObject o2=new MyObject();

        System.out.println(o1.equals(o2));
    }
}