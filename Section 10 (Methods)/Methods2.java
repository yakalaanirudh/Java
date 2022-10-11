public class Methods2
{

    int gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)m=m-n;
            else n=n-m;
        }
        return m;
    }

    public static void main(String[] args)
    {
        Methods2 x=new Methods2();
        System.out.println(x.gcd(35,56));




    }


    static boolean isPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;

    }

}