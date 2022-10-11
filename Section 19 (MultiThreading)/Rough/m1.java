class shared{
    String s;

    shared(String s){
        this.s=s;
    }
    public void f1(String s){
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
            try{Thread.sleep(100);}catch(Exception e){}
        }
    }
}

class MyThread extends Thread{
    shared a=new shared(d);
    public void run(){
        a.f1;
    }
}


public class m1{
    public static void main(String[] args){
        shared o=new shared("Anirudh");
        MyThread t1=new MyThread(o);
        t1.start();
    }
}