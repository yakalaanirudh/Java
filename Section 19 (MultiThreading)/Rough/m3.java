class shared2{
    public void f1(String s){
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
            try{Thread.sleep(100);}catch(Exception e){}
        }
    }
}

class MyThread extends Thread{

    shared2 s;
    MyThread(shared2 s){
        this.s=s;
    }
    public void run(){
        s.f1("Anirudh");
    }
}


public class m2{
    public static void main(String[] args){
        shared2 o=new shared2();
        MyThread t1=new MyThread(o);
        t1.start();
    }
}