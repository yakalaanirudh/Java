@FunctionalInterface
interface MyLambda
{
    public void display(String str);
}

public class MethodReference4 {

    public static void main(String[] args) {
        
        MyLambda ml=System.out::println;        //This println is assigned to dispaly method in MyLambda Interface
        ml.display("Anirudh");             //Anirudh

        
    }
    
}