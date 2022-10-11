class Outer
{
    public void display()
    {
        class Inner
        {
            public void show()
            {
                System.out.println("Hello");
            }
        }
        new Inner().show();  //Here we are calling a  method without creating an object so it is anonymous object
    }


}

public class LocalInner7
{
    public static void main(String[] args)
    {
        Outer o=new Outer();
        o.display();

    }

}