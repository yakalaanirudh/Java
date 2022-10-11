class multi extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }
    }
}

public class a{
    public static void main(String[] args){
        multi a=new multi();
        a.start();
    }
}

/*The above program prints 1 2 3 4 */