class Super
{
    public void meth1()
    {
        System.out.println("Super Meth1");
    }

    public void meth2()
    {
        System.out.println("Super Meth2");
    }
}

class Sub extends Super
{
    //@Override
    public void meth2()
    {
        System.err.println("Sub Meth2");
    }

    public void meth3()
    {
        System.out.println("Sub Meth3");
    }
}

public class DynamicMethodDispatch10
{
    public static void main(String[] args)
    {
        Super sup=new Sub();

        sup.meth1();
        sup.meth2();


    }
}
/*
Super Meth1
Sub Meth2

But when @Override is commented
Output is
Sub Meth2
Super Meth1
 */