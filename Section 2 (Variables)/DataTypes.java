public class DataTypes {

    public static void main(String[] args) {

        System.out.println("Int Min: "+Integer.MIN_VALUE);
        System.out.println("Int Max: "+Integer.MAX_VALUE);
        System.out.println("Int Bytes :"+Integer.BYTES);

        System.out.println("Byte Min: "+Byte.MIN_VALUE);
        System.out.println("Byte Max: "+Byte.MAX_VALUE);
        System.out.println("Byte Bytes :"+Byte.BYTES);

        System.out.println("Float Min: "+Float.MIN_VALUE);
        System.out.println("Float Max: "+Float.MAX_VALUE);
        System.out.println("Float Bytes :"+Float.BYTES);
    }

}
/*
Output is
Int Min: -2147483648
Int Max: 2147483647
Int Bytes :4
Byte Min: -128
Byte Max: 127
Byte Bytes :1
Float Min: 1.4E-45
Float Max: 3.4028235E38
Float Bytes :4
 */