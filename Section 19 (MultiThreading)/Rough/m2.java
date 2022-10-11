class shared1{
    public void f1(String s){
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
            try{Thread.sleep(100);}catch(Exception e){}
        }
    }
}

class MyThread extends Thread{

    String s;
    MyThread(String s){
        this.s=s;
    }
    public void run(){
        s.f1;
    }
}


public class m2{
    public static void main(String[] args){
        shared o=new shared("Anirudh");
        MyThread t1=new MyThread();
        t1.start();
    }
}