public class Printing2 {

    public static void main(String[] args) {
        int a=10;//a=-10
        System.out.printf("%05d",a);

        float b=123.45f;//3.45f
        System.out.printf("%6.2f",b);

        String str="Java";
        System.out.printf("%20s",str);

    }

}

/*
Output is
00010
123.45
                Java
 */