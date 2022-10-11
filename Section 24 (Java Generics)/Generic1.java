public class Generic1{
    public static void main(String[] args){
        Object obj=new String("Hello");
        //obj=new Integer(10);
        String str=(String)obj;     //This is typecasting
    }
}
//When we try to run the above function we get run time error because an Integer cant be converted to string
//We won't get a compile time error

public class Generic1{
    public static void main(String[] args){
        Object obj[]=new Object[3];
        obj[0]="hi";
        obj[1]="bye";
        obj[2]=new Integer(10);     //This does not give a compile time error but a run time error

        String str;
        for(i=0;i<3;i++){
            str=(String)obj[i];
            System.out.println(str);
        }
    }
}


//Generic
public class Generic1<T>{           //<T> makes the class generic it must be made
    T data[]=(T[]) new Object[3];   //We are creating an array of objects and typecasting them as generic (T[]) new Object[3]
    public static void main(String[] args){
        Generic1<String> gd=new Generic1();     //This creates a object of the class(array) whose elements are strings
        //Generic1<Integer> gd=new Generic1();     //This creates a object of the class(array) whose elements are Integer

        gd.data[0]="Hi";
        gd.data[1]="Bye";
        gd.data[2]=10;      //Now this gives a compile error saying int->string

        String str=data[0];  //We dont have to type cast becuase the array is declared as type string
        }
    }
}
