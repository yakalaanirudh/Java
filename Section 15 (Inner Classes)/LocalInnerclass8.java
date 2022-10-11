
abstract class My{
    abstract public void show();
}
class Outer
{
    public void display()
    {
        My m=new My()
        {
            public void show()
            {
                System.out.println("Hello");
            }
        };
        m.show();
    }


}

public class LocalInnerclass8
{
    public static void main(String[] args)
    {
        Outer o=new Outer();
        o.display();

    }

}

/*
    public void display()
    {
        new My()
        {
            public void show()
            {
                System.out.println("Hello");
            }
        }.show();
    }
*/
/*The above is anonymous object*/