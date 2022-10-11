public class StaticBlockPractice
{
    static
    {
        System.out.println("Block 1");
    }
    static
    {
        System.out.println("Block 2");
    }
    public static void main(String args[])
    {

    }
}

//When we execute the above the output is
/*
Block 1
Block 2
 */

public class StaticBlockPractice2
{
    static
    {
        System.out.println("Block 1");
    }

    public static void main(String args[])
    {
        System.out.println("Main");
    }

    static
    {
        System.out.println("Block 2");
    }
}

//When we execute the above the output is
//Main method is executed after executing all static blocks
/*
Block 1
Block 2
Main
 */

class Test{
    static
    {
        System.out.println("Block 1");
    }
    static
    {
        System.out.println("Block 2");
    }
}

public class StaticBlockPractice3
{
    public static void main(String args[])
    {
        System.out.println("Main");
    }

}
//When we execute the above the output is
/*
Main
 */

class Test{
    static
    {
        System.out.println("Block 1");
    }
    static
    {
        System.out.println("Block 2");
    }
}

public class StaticBlockPractice3
{
    public static void main(String args[])
    {
        Test t1=new Test();
        System.out.println("Main");
    }

}

//When we execute the above the output is
/*
Block 1
Block 2
Main
 */


class Test{
    static
    {
        System.out.println("Block 1");
    }
    static
    {
        System.out.println("Block 2");
    }
}

public class StaticBlockPractice3
{
    public static void main(String args[])
    {
        System.out.println("Main");
        Test t1=new Test();
    }

}
//When we execute the above the output is
/*
Main
Block 1
Block 2
 */