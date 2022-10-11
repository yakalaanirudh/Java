import java.util.*;

public class ReadKeyboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //int  x=sc.nextInt();
        //float x=sc.nextFloat();
        //String x=sc.nextLine();

        int x,y;
        System.out.println("Enter 2 numbers: ");
        x=sc.nextInt();
        y=sc.nextInt();

        int z=x+y;
        System.out.println("Sum is "+z);

        /*sc.useRadix(2);
        int x=sc.nextInt();
        System.out.println(x);*/
    }
}
/*
The above program when executed asks for two inputs
When we give the two inputs say 7 and 11
It gives the output
Sum is 18
 */