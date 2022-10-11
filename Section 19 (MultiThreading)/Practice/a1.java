class multi1 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);

            try{Thread.sleep(1000);}
            catch(Exception e){};
        }
    }
}

public class a1{
    public static void main(String[] args){
        multi1 a=new multi1();
        a.start();
    }
}

/*The above program prints 1 2 3 4 with a gap of 1000 milliseconds between each number*/