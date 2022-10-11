//Lambda Expressions are used for defining anonymous methods and are used with help of interfaces
//A functional interface is one which has only one method
@FunctionalInterface
interface MyLambda
{
    public void display();
}

/*class My implements MyLambda
{
    public void display()
    {
        System.out.println("Hello World");
    }
}

public class LamdaDemo
{
    public static void main(String[] args)
    {
        MyLambda m=new My();
        m.display()
     }
}
*/


/*
public class LambdaDemo
{
    public static void main(String[] args)
    {
        MyLambda m=new MyLambda(){          //This is an anonymous inner class(method)(object)
            public void display(){
                System.out.println("Hello world");
            }
        };
        m.display();
    }
}
*/

public class LamdaDemo1 {

    public static void main(String[] args) {

        MyLambda m=()->{System.out.println("Hello world");};        //This is lambda expression
        m.display();

    }

}
