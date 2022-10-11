//No Parameters
@SupressWarnings("unchecked")
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

public class Generic3{
    public static void main(String[] args){
        MyArray ma=new MyArray<>();             //If we dont mention type java takes it as type object
        //So we can enter any type of object
        //MyArray<Integer> ma=new MyArray<>();
        //MyArray<String> ma=new MyArray<>();

        ma.append(10);
        ma.append("Hi");
        ma.append(30);

        ma.display();
    }
}
//No Parameters


//Multiple Parameters
@SupressWarnings("unchecked")
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

public class Generic3{
    public static void main(String[] args){
        MyArray<Integer,String> ma=new MyArray<>();             //This is used for key value pairs

        ma.append(10);
        ma.append("Hi");
        ma.append(30);

        ma.display();
    }
}
//Multiple Parameters



//Sub Types
//If a class is generic then its subclass is also generic
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
class MyArray2 extends MyArray<String>{/*"Body for MyArray2"*/}
//Here my array2 extends from type string my array
//So MyArray2 is also type string

//If we want Myarray2 to be generic then make myarray generic too
class MyArray2<T> extends MyArray<T>{/*"Body for MyArray2"*/}
//Sub Types


//Bounded Types
class MyArray<T extends Number>{/*"Body for MyArray"*/}       //Then it can take vales of Int,double,float,Byte,Short,Long
//The objects created on this also follows same rules


class A{};
class B extends A{};
class C extends A{};

//In case of generic interfaces we can use extends instead of implements
Interface A{};
class B extends A{};
class C extends A{};
//Bounded Types