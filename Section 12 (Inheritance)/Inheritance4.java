class Parent
{
    Parent()
    {
        System.out.println("Non-Param of parent");
    }
    Parent(int x)
    {
        System.out.println("Param of parent "+x);
    }
}

class Child extends Parent
{
    Child()
    {
        System.out.println("Non-Param of child");
    }
    Child(int y)
    {
        System.out.println("Param of child");
    }
    Child(int x,int y)
    {
        super(x);
        System.out.println("2 param of child "+y);
    }
}

public class Inheritance4 {

    public static void main(String[] args) {
        Child c1=new Child();
        Child c2=new Child(20);
        Child c3=new Child(10,20);
    }

}


/*
Output is
Non-Param of parent
Non-Param of child

Non-Param of parent
Param of child

Param of parent 10
2 param of child 20
 */