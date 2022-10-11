class MyData{
    public void display(String str) {
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        }
    }
}
/*The class MyData is our shared object*/
class MyThread1 extends Thread{
    MyData d;                               //This is a reference of MyData
    public MyThread1(MyData d){
        //This is a constructor It takes parameter of MyData and assign it to the d reference in the earlier line
        this.d=d;
    }
    public void run(){
        d.display("Hello World");
    }
}

class MyThread2 extends Thread{
    MyData d;
    public MyThread2(MyData d){
        this.d=d;
    }
    public void run(){
        d.display("Welcome All");
    }
}



public class Synchronisation2{
    public static void main(String[] args){
        MyData data=new MyData();
        MyThread1 t1=new MyThread1(data);
        MyThread2 t2=new MyThread2(data);

        t1.start();
        t2.start();
    }
}

/*This is synchrozised\
Hello World
Welcome
 */
