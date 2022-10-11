
public class Wrapper2 {

    public static void main(String[] args) {

        Integer i=new Integer(10);          /*This creates an integer object whose value is 10*//*Deprecated*/
        Integer a=Integer.valueOf(10);          /*It is boxing*//*Non deprecated*/
        Integer b=10;                               /*Correct Method*/

        Byte c=15;
        Byte d=Byte.valueOf("15");


        Short f=Short.valueOf("123");

        Float g=12.3f;


        Double j=Double.valueOf(123.456);

        Character k=Character.valueOf('A');

        Boolean l=Boolean.valueOf("true");

        /* byte bb=15;      This creates a variable(bb)
        * Byte e=Byte.valueOf(bb)   This creates a box around that variable making it an object(e)
        *This process is called boxing or wrapping
        * */
        byte bb=15;         /*We do this because we directly cannot give Byte e=Byte.valueOf(15)*/
        Byte e=Byte.valueOf(bb);    /*Since 15 is an integer literal*/

        Float h=Float.valueOf("123.5");         /*This creates an object h*/
        float x=h.floatValue();                 /*It is unboxing*//*It gives a primitive value*/
        float y=h;                              /*It is auto-unboxing*//*It gives a primitive value*/

        int m=10;
        //Integer n=Integer.valueOf(m);         /*It is boxing*/
        Integer n=m;                            /*It is auto-boxing*/
        //int p=n.intValue();                   /*It is unboxing*/
        int p=n;                                /*It is auto-unboxing*/
    }

}