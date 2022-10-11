@FunctionalInterface
interface MyLambda
{
    public void display(String str);
}


public class MethodReference4b {

    public static void reverse(String str){
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.err.println(sb);
    }
    public static void main(String[] args) {
        
        MyLambda ml=MethodReference4b::reverse;        //This println is assigned to dispaly method in MyLambda Interface
        ml.display("Anirudh");             //hdurinA

        
    }
    
}

/*
The benefit of this is we can pass any method to display method and call it using display method
 */


 //In the above example the method REVERSE is static what if it is not static
 //Then we create an object of it
/*
@FunctionalInterface
interface MyLambda
{
    public void display(String str);
}


public class MethodReference4b {

    public  void reverse(String str){
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.err.println(sb);
    }
    public static void main(String[] args) {

        MethodReference4b mr=new MethodReference4b()
        
        MyLambda ml=mr::reverse;        //This println is assigned to dispaly method in MyLambda Interface
        ml.display("Anirudh");             //hdurinA

        
    }
    
}
*/

//In the below example we assign a constructor
//We just have to type new

/*
@FunctionalInterface
interface MyLambda
{
    public void display(String str);
}


public class MethodReference4b {

    public  void MethodReference4b(String s){System.out.println(s.toUpperCase())}
    public static void main(String[] args) {

        
        MyLambda ml=MethodReference4b::new;        //This println is assigned to dispaly method in MyLambda Interface
        ml.display("Anirudh");                      //ANIRUDH

        
    }
    
}
*/


//Here we assign a new function lets say compare to 
/*
@FunctionalInterface
interface MyLambda
{
    public int display(String str1,String str2);
}


public class MethodReference4b {

    public static void main(String[] args) {

        
        MyLambda ml=MethodReference4b::compareTo;        //This println is assigned to dispaly method in MyLambda Interface
        ml.display("Anirudh","Anirudh");                 //

        
    }
    
}

 */