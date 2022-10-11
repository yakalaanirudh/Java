import java.lang.reflect.*;

//The below class has 4 properties 2 constructors and 2 methods
class My
{
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {}

    public My(int x,int y) {}

    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}

}

public class Reflection8
{
    public static void main(String[] args)
    {
        Class c=My.class;       //Gives description of class My
        System.out.println(c.getName());    //Print info about class My

        /*
            My m=new My()
            Class c1=m.getClass()       //It gives description of class My

         */

        Field field[]=c.getDeclaredFields();        //Field is a class  //a,b,c,d

        Method meth[]=c.getMethods();               //display,show

        for(Method m:meth)
            System.out.println(m);

        Parameter param[]=meth[0].getParameters();      //Displays parameters in the methods declared

        for(Parameter p:param)
        {
            System.out.println(p);
        }

        Constructor con[]=c.getConstructors();

        for(Constructor ct:con)
        {                               //Displays all constructors
            System.out.println(ct);
        }
    }
}

/*Reflection package is used to get details of the class*/
