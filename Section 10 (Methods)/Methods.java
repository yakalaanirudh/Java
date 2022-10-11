public class Methods {

    static int max(int x,int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }

    static void inc(int x)
    {
        x++;
        System.out.println(x);
    }

    public static void main(String[] args) {

        int a=10,b=15;
        System.out.println(max(a,b));

        Methods mp=new Methods();
        System.out.println(mp.max(a,b));

        int c=10,d=15;
        inc(c);
        System.out.println(c);


    }
}
/*
The output is
15
15
11
10
 */