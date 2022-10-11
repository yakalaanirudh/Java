abstract class My()
{
    abstract void Display();
}

class Outer
{
    public void meth()
    {
        My m=new My()
        {
            public void Display()
            {
                System.out.println("Hello");
            }
        };
        m.Display();
    }
}
/*
We cannot create Objects with Abstract classes
So
My m=new My()
        {
            public void Display()
            {
                System.out.println("Hello");
            }
        };

In between those two braces we are overwriting all methods of the abstract class,
making it a concrete class which has no name.
So it is called Anonymous Inner class.
        {
            public void Display()
            {
                System.out.println("Hello");
            }
        };

 */