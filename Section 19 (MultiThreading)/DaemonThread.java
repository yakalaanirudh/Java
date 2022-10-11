class MyThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(count++);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args){
        /*
        MyThread t=new Mythread();          This continues to print
        t.start()
         */

        /*
        MyThread t=new Mythread();          This continues to print
        t.setDaemon(true)                       //Now it wont print anything because main thread immediately stops
        t.start()
        try{Thread.sleep(100);}catch(Exception e){}     //This makes thread alive for 100 ms and terminates
         */
    }
}