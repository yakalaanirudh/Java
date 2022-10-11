class year{
    int months=12;
    int days=365;
    int weeks=52;

    static void MyMethod(){System.out.println("I am an year");}

}

public class practice1a{
    static class month{
        int months=1;
        int days=30;
        int weeks=4;
    }

    class day{

    }
    public static void main(String []args){
        year a=new year();
        System.out.println(a.months);
        a.MyMethod();
    }
}