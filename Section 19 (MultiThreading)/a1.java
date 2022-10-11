class shared{
    public void display(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
            try{Thread.sleep(100);}catch(Exception e){}
        }

    }
}
//The above is the shared object it just has the method to be used by the threads
class MyThread extends Thread{
    shared s;                   //We are creating a reference of the shared object
    MyThread(shared s){
        this.s=s;               //We are passing the parameter and assigning to the reference
    }

    public void run(){
        s.display("Anirudh");   //We are calling display method on the argument passed
    }
}


class MyThread1 extends Thread{
    shared s;
    MyThread1(shared s){
        this.s=s;
    }

    public void run(){
        s.display("Surya");
    }
}
public class a1{
    public static void main(String[] args){
        shared s1=new shared();
        MyThread t1=new MyThread(s1);
        t1.start();
        MyThread1 t2=new MyThread1(s1);
        t2.start();
    }
}
/*
A
S
u
n
i
r
y
r
a
u
d
h
 */