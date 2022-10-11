class multi2 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);

            try{Thread.sleep(1000);}
            catch(Exception e){};
        }
    }
}

public class a2{
    public static void main(String[] args){
        multi2 a=new multi2();
        multi2 b=new multi2();
        a.start();
        b.start();
    }
}

/* Both threads execute simultaneously
1
1
2
2
3
3
4
4

 */