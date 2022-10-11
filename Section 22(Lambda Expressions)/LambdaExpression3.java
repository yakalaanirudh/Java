
//1

/*
So the summary is if we declare a varibale outside a lambda expression we can access and modify it inside the lambda expression
But we cant modify it outside teh lambda expression
 */

interface MyLambda
{
    public void display();
}

class Demo {
    
    //int counta=10                                 //If the variable is declared outside it can be accessed but cant be modified later
    //i.e Lambda expressions acan access variables that are final or effectively final only i.e they cant be modified

    public void method1(){
        int count=10;
        count++;                                        //We can modify the values too
        MyLambda ml=()->System.out.println("Hi");       //Here we are overriding display method
        //MyLambda ml=()->System.out.println("Hello");  //We can have multiple statements too

        //MyLambda ml=()->System.out.println("Hello"+counta);    //We can access the variables too
        //counta++                                              //Can be modified too

        //MyLambda ml=()->System.out.println("Hello"+count);    //We can access the variables too
        //MyLambda ml=()->System.out.println("Hello"+count++);    //We can access the variables too
    }
    //counta+=10                                    //If the variable is declared outside it can be accessed but cant be modified later
}


public class LambdaExpression3 {

    public static void main(String[] args) {
        Demo d=new Demo();
        d.method1();
    }

}
//1




