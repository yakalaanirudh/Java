public class Printing1 {

    public static void main(String[] args) {
        int x=10;
        float y=12.56f;
        char z='A';
        String str="Java Program";

        System.out.printf("%3$s %2$f %1$d",x,y,str);
        System.out.printf("Hello %d %f %c %s\n",x,y,z,str);
        //%o,%x,%e for float value
    }
}
/*
Output is
Java Program 12.560000 10Hello 10 12.560000 A Java Program
 */