public class Integer3 {

    public static void main(String[] args) {

        int m1=15;          //This is a primitive

        //Integer m2=m1;    //This is an object
        //Integer m3=15;

        Integer m2=Integer.valueOf("123");
        //Integer m3=Integer.valueOf("11111111", 2);        //Binary to number
        Integer m3=Integer.valueOf("A7", 16);       //Hexadecimal to number
        Integer m4=Integer.decode("0xA7");

        //System.out.println(m2.equals(m1));    //True comparison of values of primitive and object
        //System.out.println(m2.equals(m3));    //True comparison of values of primitive and object
        //System.out.println(m3);

        //System.out.println(Integer.parseInt("123"));
        //System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(40));

    }

}

/*A Float is a class, or a reference type, defined in the standard library.
It stores a reference to an object containing a value (a "box").
A float on the other hand, is a primitive type and part of the language itself.*/