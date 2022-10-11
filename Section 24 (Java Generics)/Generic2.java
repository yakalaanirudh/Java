class Data<T>{
    private T obj;          //This means the obj can be of any type

    public void setData(T v){
        obj=v;
    }

    public T getData(){
        return obj;
    }
}

public class Generic2{
    public static void main(String[] args){
        //Data<Integer> d=new Data<Integer>();  Not required to write integer
        Data<Integer> d=new Data<>();             //We are creating a obj of class Data
        //We can store any data type in d ,but we just have to specify what
        //Data<String> d=new Data<>();
        d.setData(10);
        System.out.println(d.getData());
    }
}


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

public class Generic2{
    public static void main(String[] args){
        MyArray<Integer> ma=new MyArray<>();
        //MyArray<String> ma=new MyArray<>();

        ma.append(10);
        ma.append(20);
        ma.append(30);

        ma.display();
    }
}