//2
//The below is passing lambda expression as a parameter
interface MyLambda
{
    public void display();
}


class UseLambda
{
    public void callLambda(MyLambda ml)
    {
        ml.display();
    }
}

class Demo
{
    public void method1(){
        UseLambda ul=new UseLambda();
        ul.callLambda(()->{System.err.println("Hello");});

    
    }
}


public class LambdaExpression3b {

    public static void main(String[] args) {
        Demo d=new Demo();
        d.method1();
    }

}

//2