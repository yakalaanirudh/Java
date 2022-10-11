class Super
{
    public void display()
    {
        System.out.println("Super Display");
    }
}

class Sub extends Super
{
    public void display()
    {
        System.out.println("Sub Display");
    }
}

public class Override7
{
    public static void main(String[] args)
    {
        Super s=new Sub();
        s.display();

    }
}
/*
The output is
Sub Display
 */