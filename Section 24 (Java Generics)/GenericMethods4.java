class MyArray<T>{
    T A[]=(T[]) new Object[10];

    public void append(T v){
        A[length++]=v;
    }

    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}

public class GenericMethods4{

    static <T> void show(T[] List) {        //We we are specifyong return type is generic
        for(T x:List){
            System.out.println(x);
        }
    }

    public static void main(String[] args){
        show(new String[]{"Hi","Go","Bye"});        //In show method we can pass all types of datatypes here string
        show(new Integer[]{10,20,30,40,50});        //In show method we can pass all types of datatypes here Integer
    }
}

/*VARIABLE ARGUMENTS
public class GenericMethods4{

    static <T> void show(T... list) {        //We we are specifyong return type is generic
        for(T x:List){
            System.out.println(x);
        }
    }

    public static void main(String[] args){
        show("Hi","Go","Bye");        //In show method we can pass all types of datatypes here string
        show(10,20,30,40,50);        //In show method we can pass all types of datatypes here Integer
    }
}
*/

/*BOUND TYPES
public class GenericMethods4{

    static <T extends Number> void show(T[] List) {        //Only Numbers
        for(T x:List){
            System.out.println(x);
        }
    }

    public static void main(String[] args){
        show(new String[]{"Hi","Go","Bye"});        //Not allowed
        show(new Integer[]{10,20,30,40,50});        //In show method we can pass all types of datatypes here Integer
    }
}
 */


