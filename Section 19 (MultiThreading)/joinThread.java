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

public class joinThread {
    public static void main(String[] args){

        /*
        MyThread t=new Mythread();          This continues to print
        t.setDaemon(true)
        t.start()
        Thread mainThread=Thread.currentThread();       //This makes current Thread main Thread
        mainThread.join();              //This joins the thread to other threads
        //Now it will wait for all threads to finish
         */
    }
}