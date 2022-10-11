 //Earlier we made classes and methods as genericTo make arguments in functions as generic we use wildcards

public class GenericMethods4a{
    static void fun(MyArray obj){           //obj of data type MyArray which is generic
        obj.display();
    }


    public static void main(String[] args){
        MyArray<String> ma1=new MyArray<>();
        ma1.append("Hi");
        ma1.append("Bye");

        MyArray<Integer> ma2=new MyArray<>();
        ma1.append(10);
        ma1.append(20);

        fun(ma1);       //Works for string
        fun(ma2);       //Works for Integer
    }
}

/* THIS IS AN UNBOUNDED WILDCARD
public class GenericMethods4a{
    static void fun(MyArray<?> obj){            //By using <?> we are making the array which is an argument generic
        obj.display();
    }


    public static void main(String[] args){
        MyArray<String> ma1=new MyArray<>();
        ma1.append("Hi");
        ma1.append("Bye");

        MyArray<Integer> ma2=new MyArray<>();
        ma1.append(10);
        ma1.append(20);

        fun(ma1);       //Works for string
        fun(ma2);       //Works for Integer
    }
}
*/

//EXTENDS IS UPPER BOUND
//SUPER IS LOWER BOUND          MyArray<? super Number> obj     //super string means whose super class is string

/* THIS IS AN BOUNDED WILDCARD only accepts type number not string
public class GenericMethods4a{
    static void fun(MyArray<? extends Number> obj){            //By using <?> we are making the array which is an argument generic
        obj.display();
    }

    }
}
*/
