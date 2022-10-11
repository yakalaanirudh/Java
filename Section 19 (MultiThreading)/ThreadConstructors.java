/*
Constructor Types
    Thread()                                    //1
    Thread(Runnable r)                          //2
    Thread(Runnable r,String name)              //3
    Thread(Thread Group g,String name)          //4
    Thread(String name)                         //5
 */


/* Type 1
public class ThreadConstructors{
    public static void main(String[] args) throws exception{
        Thread t=new Thread();          //Non argument constructor  //1
    }
}
Type 1
 */

/* Type 5
public class ThreadConstructors{
    public static void main(String[] args) throws exception{
        Thread t=new Thread("My Thread1");          //Name constructor  //5
    }
}
Type 5
 */


/*Type 3
class MyRun implements Runnable{
    public void run(){};
}

public class ThreadConstructors{
    public static void main(String[] args) throws exception{
        Thread t=new Thread(new MyRun(),"My Name");             //Type 3
    }
Type 3
}*/


class MyThread extends Thread
{
    public MyThread(String name)            //Constructor for MyThread
    {
        super(name);            //We are passing name to the constructor of thread
        //setPriority(Thread.MAX_PRIORITY);
        //setPriority(Thread.MIN_PRIORITY+2);
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class ThreadConstructors{
    public static void main(String[] args) throws exception
    {
        MyThread t=new MyThread("MyThread 1");
        //System.out.println("ID "+t.getId());          //To get the id
        //System.out.println("Name "+t.getName());      //To get name
        //System.out.println("Priority "+t.getPriority());
        //System.out.println("State "+t.getState());
        //System.out.println("Alive "+t.isAlive());
    }
}