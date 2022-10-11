class multi3 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);

            try{Thread.sleep(1000);}
            catch(Exception e){};
        }
    }
}

public class a3{
    public static void main(String[] args){
        multi3 a=new multi3();
        multi3 b=new multi3();
        a.run();
        b.run();
    }
}

/* Both threads execute after first one is finished
1
2
3
4
1
2
3
4
 */

/*
So what is the difference between the start and run method?
Main difference is that when program calls start() method
a new Thread is created and code inside run() method is executed in new Thread

while if you call run() method directly no new Thread is created
and code inside run() will execute on current Thread.

 */