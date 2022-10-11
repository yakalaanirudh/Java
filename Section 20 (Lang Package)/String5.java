public class String5
{
    public static void main(String[] args)
    {
        String s1=new String("Hello");

        StringBuffer s2=new StringBuffer("Hello");

        StringBuilder s3=new StringBuilder("Hello");

        s1.concat(" World");
        s2.append(" World");
        s3.append(" World");

        System.out.println(s1);     //Hello     //It is immutable
        System.out.println(s2);     //Hello World
        System.out.println(s3);     //Hello World

    }
}

//In java strings are immutable-i.e cannot be changed
//When we modify a string we create a new object

//To make strings mutable we use string buffer
//String buffer is thread safe

//Th eonly difference between string buffer and string difference is the later is not thread safe*/