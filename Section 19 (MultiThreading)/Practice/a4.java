class multi4 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);

            try{Thread.sleep(1000);}
            catch(Exception e){};
        }
    }
}

public class a4{
    public static void main(String[] args){

        for(int i = 1; i <= 3; i++){
            multi4 a=new multi4();
            a.start();
        }
    }
}

/*
This creates 4 threads
 */