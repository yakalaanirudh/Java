class MyData
{
    int value;
    boolean flag=true;                              //We use this boolean because see at end

    synchronized public void set(int v)             //Producer uses set method
    {
        while(flag!=true)                           //Wait when flag=false
            try {wait();}catch(Exception e){}

        value=v;
        flag=false;
        notify();
    }

    synchronized public int get()                   //Consumer uses get method
    {
        int x=0;
        while(flag!=false)                          //Wait when flag=true
            try {wait();}catch(Exception e){}


        x=value;
        flag=true;
        notify();

        return x;
    }
}

class Producer extends Thread
{
    MyData data;

    public Producer(MyData d)
    {
        data=d;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            data.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}

class Consumer extends Thread
{
    MyData data;

    public Consumer(MyData d)
    {
        data=d;
    }
    public void run()
    {
        int value;
        while(true)
        {
            value=data.get();
            System.out.println("Consumer "+value);
        }
    }
}

public class a3
{
    public static void main(String[] args)
    {
        MyData data=new MyData();

        Producer p=new Producer(data);
        Consumer c=new Consumer(data);

        p.start();
        c.start();

    }
}
//Notify method notifies the waiting thread
//Notify All notifies all waiting threads
//The set and end methods are independent of each other so another producer is not allowed into set method
//But it wont stop another consumer from entering get method
//So to make get and set dependent on each other we use the boolean
//i.e to connect get and set we use boolean


/*
Producer 1
Consumer 1
Consumer 2
Producer 2
Producer 3
Consumer 3
 */