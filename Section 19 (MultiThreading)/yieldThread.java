class MyThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(count++ +"Hi");
        }
    }
}

public class yieldThread {
    public static void main(String[] args){

        MyThread t=new Mythread();
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(count++ +"Bye");
        }
        //This prints both methods
    }
}

/*
public class yieldThread {
    public static void main(String[] args){

        MyThread t=new Mythread();
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(count++ +"Bye");
            //Thread.yield();                 //This makes the thread in which it is written to yield
        }
        //This prints both methods but Hi is printed more
    }
}
*/
