public class StringPractice3 {

    public static void main(String[] args) {


        String str1="Pyramid";
        String str2="pyramid";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1==str2);



        String str3="pyramid";

        String str4="china wall";
        String str5=new String("china tall");

        System.out.println(str3.equals(str4));
        System.out.println(str3.compareTo(str4));



        String str6="the great wall ";
        String str7="of china";
        System.out.println(str6.contains("wall"));
        System.out.println(str6.concat(str7));
        System.out.println(str6 + str7);

    }

}
/*
The Output is
false
true
false
false
13
true
the great wall of china
the great wall of china
 */